This readme documents the process for updating EMF models for changes made to
their related schema.

1.  Update the XSD plugin (org.switchyard.tools.xsd), if needed, to ensure the
    schema is being downloaded and included in the catalog file
    (switchyard_catalog.xml).  All schema should be located within the plugin's
    schema/ folder.
2.  Add "schemaLocation" attributes for each "import" statement within the
    schema, doing the same for the imported schema
    (e.g. schemaLocation="switchyard-v1.xsd").  Make a note of these imported
    schema as you will need to specify them when generating the EMF model.
3.  Select the schema from the xsd plugin's schema/ folder, right-click,
    New->Other..., EMF Generator Model.
    1.  Specify whatever name you want for the genmodel file.  Press Next.
    2.  Select XML Schema.  Press Next. 
    3.  Add to the list of schema every schema imported into the schema being
        used to generate the model
        (e.g. platform:/resource/org.switchyard.tools.xsd/schema/bpm-v1.xsd platform:/resource/org.switchyard.tools.xsd/schema/switchyard-v1.xsd platform:/resource/org.switchyard.tools.xsd/schema/sca-1.1-cd06.xsd).
        Press Load.  You may get a warning about ws-policy, this is OK.  If you
        get other warnings/errors, you need to ensure you've added
        schemaLocation attributes for all imports _and_ you've added all
        imported schema to the list of schema used for generating the model.
        Press Next.
    4.  Add the following genmodel files:
            org.switchyard.tools.models.sca.core/model/
                addressing.genmodel
                instance.genmodel
            org.switchyard.tools.models.sca.sca1_1/model/
                sca.genmodel
            org.switchyard.tools.models.switchyard1_0/model/
                switchyard_1.0.genmodel
        Select all of the genmodels listed except for the one associated with
        the schema/model you are updating.  Update the name for the ecore
        file(s) (ideally, they should match those of the existing files).
        Press Finish.
4.  Update the newly generated ecore file to minimize differences:
    1.  Set the "name" and "nsPrefix" attributes to match the existing model.
    2.  Replace all "../../org.switchyard.tools.models.switchyard1_0/model/config.switchyard.ecore"
        with "config.switchyard.ecore".
    3.  Replace all "../.." with "platform:/plugin".
    4.  Save the changes.
5.  Merge the model changes by diff'ing the newly generated ecore file with the
    existing file (select both files, right-click, Compare With->Each other...
    If significant changes exist, ensure that the element ordering is consistent
    between the newly generated file and the existing file.  Theoretically, the
    only differences should be additions, changes or removals.
6.  Update the switchard_1.0.genmodel file (right-click the file, Reload...).
7.  Regenerate model code.
8.  Regenerate edit code.

