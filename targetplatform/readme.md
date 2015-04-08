# Setup Guide
This document covers how to setup the Eclipse workspace to run _JBoss SwitchYard Tooling_ from inside a vanilla Eclipse.

## Generating the target platform
If you want to do development in Eclipse for SwitchYard Tooling you need to have our target platform mirrored to your local machine so Eclipse can resolve used bundles. Creating the mirror takes quite a while and should only be done if the version of upstream bundles changed. (or the used JBoss Tools Integration Stack version)

Here's how to generate the mirror...

    $ cd tools/targetplatform
    $ mvn -Pmultiple2repo
       OR
    $ mvn -Pmultiple2repo -U -Dmirror-target-to-repo.includeSources=true -Dtycho.localArtifacts=ignore clean install (that will include SDKs)

Once the download is done you end up with a target platform folder inside the *target* subfolder. Now copy this folder to a place you want to keep the target platform mirror and remember the location for the Eclipse Setup below...

## Eclipse Setup
At _master_ branch we always try to use the latest Eclipse version. Please refer to the target platform plugin to see which versions of Eclipse are supported. The _master_ branch was using *Eclipse Luna* when this document was created.

Now its time to open your Eclipse if you haven't done so.

Here's how to setup Eclipse...

- create a new workspace for working on _JBoss SwitchYard Tooling_
- import the project into Eclipse from directory "tools" (_Import... -> General -> Existing Project_)
- open the Eclipse preferences and select *Plug-in Development / Target Platform* in the list.
- now click the *Add* button and select *Nothing: Start with an empty target platform*
- click *Next* and give that target platform a name and click the button *Add* in the *Locations* tab
- choose *Directory* and click *Next*
- in the location browse dialog click on *Browse* and navigate to your platform mirror folder
- click *OK* to close the file browser
- validate that the location in the text field is correct and click *Finish"
- click *Finish* to close the dialog and then the Eclipse preferences
- make sure you checked the checkbox in front of your new target platform definition to activate it

Now your Eclipse has set the target platform you need for running _JBoss SwitchYard Tooling_. A rebuild of all imported projects is done directly after setting the target platform. Make sure there are no more errors displayed in any of the projects.

