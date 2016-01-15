package org.gmod.chado

class Elementresult {

	Double signal
	Element element
	Quantification quantification

	static hasMany = [elementresultRelationshipsForObjectId: ElementresultRelationship,
	                  elementresultRelationshipsForSubjectId: ElementresultRelationship]
	static belongsTo = [Element, Quantification]

	// TODO you have multiple hasMany references for class(es) [ElementresultRelationship] 
	//      so you'll need to disambiguate them with the 'mappedBy' property:
	static mappedBy = [elementresultRelationshipsForObjectId: "TODO",
	                   elementresultRelationshipsForSubjectId: "TODO"]

	static mapping = {
		id column: "elementresult_id", generator: "assigned"
		version false
	}

	static constraints = {
		signal scale: 17
	}
}
