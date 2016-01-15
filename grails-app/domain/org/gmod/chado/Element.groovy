package org.gmod.chado

class Element {

	Feature feature
	Dbxref dbxref
	Arraydesign arraydesign
	Cvterm cvterm

	static hasMany = [elementRelationshipsForObjectId: ElementRelationship,
	                  elementRelationshipsForSubjectId: ElementRelationship,
	                  elementresults: Elementresult]
	static belongsTo = [Arraydesign, Cvterm, Dbxref, Feature]

	// TODO you have multiple hasMany references for class(es) [ElementRelationship] 
	//      so you'll need to disambiguate them with the 'mappedBy' property:
	static mappedBy = [elementRelationshipsForObjectId: "TODO",
	                   elementRelationshipsForSubjectId: "TODO"]

	static mapping = {
		id column: "element_id", generator: "assigned"
		version false
	}
}
