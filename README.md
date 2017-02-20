# Public Documents
The Regulation on Public Documents (http://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX%3A32016R1191) foresees the use of multilingual standard forms suitable for electronic exchange in order to facilitate the translation of the public documents to which they are attached.
The objective of this task is to create the technical representations of the standardised forms for the Regulation on Public Documents as XML schema files (xsd).
In order to maximize semantic and technical interoperability, the XML schemas will use existing standards or results from previous projects where possible, and will have - at the core - a common subset of each form while additional elements will be included, if needed, for each MS.
# Standards used
The XML schemas generated contain the following standards: 
* Core Vocabularies (https://joinup.ec.europa.eu/community/semic/og_page/core-vocabularies)
* UBL (http://docs.oasis-open.org/ubl/UBL-2.1.html) 

# Tools used
* Modelling: Papyrus: https://eclipse.org/papyrus/ 
* Transformation: Acceleo: http://www.eclipse.org/acceleo/
* XSD validation: 
	* SQC (http://xml.coverpages.org/IBM-SQC211-CommandUse.html)
	* XSV (http://www.ltg.ed.ac.uk/~ht/xsv-status.html)
	* JAXB (http://www.oracle.com/technetwork/articles/javase/index-140168.html - check is performed only if the Java objects are generated)

# File structure
* config.properties: contains all the variables used by Acceleo to perform the transformation of the model into XML schemas
* model: contains the UML model (class diagram) created via Papyrus
* src: contains the Acceleo templates that perform the transformation
* lib: libraries used by the Acceleo modules
* generated: contains the XML schemas generated

# Licence
* The XML schemas are released under ISA Open Metadata Licence v1.1 (https://joinup.ec.europa.eu/category/licence/isa-open-metadata-licence-v11)
* The code is released under EUPL v1.1 (https://joinup.ec.europa.eu/community/eupl/og_page/european-union-public-licence-eupl-v11)