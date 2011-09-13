/* 
 * JBoss, Home of Professional Open Source 
 * Copyright 2011 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved. 
 * See the copyright.txt in the distribution for a 
 * full listing of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use, 
 * modify, copy, or redistribute it subject to the terms and conditions 
 * of the GNU Lesser General Public License, v. 2.1. 
 * This program is distributed in the hope that it will be useful, but WITHOUT A 
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A 
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details. 
 * You should have received a copy of the GNU Lesser General Public License, 
 * v.2.1 along with this distribution; if not, write to the Free Software 
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, 
 * MA  02110-1301, USA.
 */
package org.switchyard.tools.ui;

import java.util.ArrayList;
import java.util.List;

import org.apache.maven.RepositoryUtils;
import org.apache.maven.artifact.repository.ArtifactRepository;
import org.apache.maven.model.Repository;
import org.apache.maven.repository.internal.MavenRepositorySystemSession;
import org.apache.maven.wagon.authentication.AuthenticationInfo;
import org.codehaus.plexus.PlexusContainer;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.m2e.core.MavenPlugin;
import org.eclipse.m2e.core.embedder.IMaven;
import org.eclipse.m2e.core.internal.embedder.MavenImpl;
import org.eclipse.m2e.core.repository.IRepository;
import org.eclipse.m2e.core.repository.IRepositoryRegistry;
import org.sonatype.aether.artifact.Artifact;
import org.sonatype.aether.repository.Authentication;
import org.sonatype.aether.repository.LocalRepository;
import org.sonatype.aether.repository.RemoteRepository;
import org.sonatype.aether.resolution.VersionRangeRequest;
import org.sonatype.aether.resolution.VersionRangeResult;

/**
 * M2EUtils
 * 
 * Utility functionality for working with m2e.
 * 
 * @author Rob Cernich
 */
@SuppressWarnings("restriction")
public final class M2EUtils {

    /** The group ID for SwitchYard core projects. */
    public static final String SWITCHYARD_CORE_GROUP_ID = "org.switchyard";
    /** The core SwitchYard API project artifact ID. */
    public static final String SWITCHYARD_API_ARTIFACT_ID = "switchyard-api";
    /** The core SwitchYard plugin project artifact ID. */
    public static final String SWITCHYARD_PLUGIN_ARTIFACT_ID = "switchyard-plugin";
    /** The core SwitchYard test project artifact ID. */
    public static final String SWITCHYARD_TEST_ARTIFACT_ID = "switchyard-test";

    /** src/main/java. */
    public static final String MAVEN_MAIN_JAVA_PATH = "src/main/java";
    /** src/main/resources. */
    public static final String MAVEN_MAIN_RESOURCES_PATH = "src/main/resources";
    /** src/test/java. */
    public static final String MAVEN_TEST_JAVA_PATH = "src/test/java";
    /** src/test/resources. */
    public static final String MAVEN_TEST_RESOURCES_PATH = "src/test/resources";

    /** The default ID for representing the JBoss Public Maven repository. */
    public static final String JBOSS_PUBLIC_REPOSITORY_DEFAULT_ID = "jboss-public-repository";

    /**
     * Creates a new Repository representing the JBoss Public Maven repository.
     * 
     * @param id to use for the new Repository.
     * @return the new Repository.
     */
    public static Repository createJBossPublicRepository(String id) {
        Repository repository = new Repository();
        repository.setId(id);
        repository.setName("JBoss Public Maven Repository");
        repository.setUrl("http://repository.jboss.org/nexus/content/groups/public");
        repository.setLayout("default");
        return repository;
    }

    /**
     * Utility method for resolving the version range for a particular artifact.
     * 
     * It would be nice if this were exposed directly from m2e.
     * 
     * @param artifact to resolve.
     * 
     * @return the version range for the artifact.
     * @throws CoreException if an error occurs.
     */
    public static VersionRangeResult resolveVersionRange(Artifact artifact) throws CoreException {
        try {
            IMaven maven = MavenPlugin.getMaven();
            ArtifactRepository localRepository = maven.getLocalRepository();

            PlexusContainer container = ((MavenImpl) maven).getPlexusContainer();
            org.sonatype.aether.RepositorySystem repoSystem = container
                    .lookup(org.sonatype.aether.RepositorySystem.class);

            MavenRepositorySystemSession session = new MavenRepositorySystemSession();
            session.setLocalRepositoryManager(repoSystem.newLocalRepositoryManager(new LocalRepository(localRepository
                    .getBasedir())));
            session.setTransferListener(((MavenImpl) maven).createArtifactTransferListener(new NullProgressMonitor()));
            VersionRangeRequest rangeRequest = new VersionRangeRequest(artifact, getRemoteRepositories(), null);
            return repoSystem.resolveVersionRange(session, rangeRequest);
        } catch (Exception e) {
            throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, "Error resolving version range", e));
        }
    }

    private static List<RemoteRepository> getRemoteRepositories() {
        List<RemoteRepository> remoteRepositories;
        try {
            remoteRepositories = RepositoryUtils.toRepos(MavenPlugin.getMaven().getArtifactRepositories());
        } catch (CoreException e) {
            // we've tried
            remoteRepositories = new ArrayList<RemoteRepository>();
        }

        // add in any other repositories
        List<IRepository> repositories = MavenPlugin.getRepositoryRegistry().getRepositories(
                IRepositoryRegistry.SCOPE_SETTINGS | IRepositoryRegistry.SCOPE_UNKNOWN);
        for (IRepository repository : repositories) {
            boolean found = false;
            for (RemoteRepository remoteRepository : remoteRepositories) {
                if (remoteRepository.getUrl().equals(repository.getUrl())) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                RemoteRepository remoteRepository = new RemoteRepository(repository.getId(), "default",
                        repository.getUrl());
                AuthenticationInfo authInfo = repository.getAuthenticationInfo();
                if (authInfo != null) {
                    remoteRepository.setAuthentication(new Authentication(authInfo.getUserName(), authInfo
                            .getPassword(), authInfo.getPrivateKey(), authInfo.getPassphrase()));
                }
                remoteRepositories.add(remoteRepository);
            }
        }
        return remoteRepositories;
    }

    private M2EUtils() {
    }

}
