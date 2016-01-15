package org.gmod.chado

class CellLine {

	String name
	String uniquename
	Date timeaccessioned
	Date timelastmodified
	Organism organism

	static hasMany = [cellLineCvterms: CellLineCvterm,
	                  cellLineDbxrefs: CellLineDbxref,
	                  cellLineFeatures: CellLineFeature,
	                  cellLineLibraries: CellLineLibrary,
	                  cellLinePubs: CellLinePub,
	                  cellLineRelationshipsForObjectId: CellLineRelationship,
	                  cellLineRelationshipsForSubjectId: CellLineRelationship,
	                  cellLineSynonyms: CellLineSynonym,
	                  cellLineprops: CellLineprop]
	static belongsTo = [Organism]

	// TODO you have multiple hasMany references for class(es) [CellLineRelationship] 
	//      so you'll need to disambiguate them with the 'mappedBy' property:
	static mappedBy = [cellLineRelationshipsForObjectId: "TODO",
	                   cellLineRelationshipsForSubjectId: "TODO"]

	static mapping = {
		id column: "cell_line_id", generator: "assigned"
		version false
	}

	static constraints = {
		name nullable: true
	}
}
