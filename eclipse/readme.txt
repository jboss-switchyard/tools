
To use a local repository when building:
1.  Create a local repository.  Invoke the following from within the "eclipse"
	directory of your Eclipse install:
		./eclipse -debug -consolelog -nosplash -verbose
				-application org.eclipse.equinox.p2.publisher.FeaturesAndBundlesPublisher
				-metadataRepository file:/<path to repo>
				-artifactRepository file:/<path to repo>
				-source . -compress -publishArtifacts
2.  Specify local.requirements property.  For example,
	mvn -Dlocal.requirements=<path to repo> ...

