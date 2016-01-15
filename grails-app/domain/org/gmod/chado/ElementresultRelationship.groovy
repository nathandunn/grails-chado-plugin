package org.gmod.chado

class ElementresultRelationship {

	String value
	Integer rank
	Elementresult elementresultByObjectId
	Elementresult elementresultBySubjectId
	Cvterm cvterm

	static belongsTo = [Cvterm, Elementresult]

	static mapping = {
		id column: "elementresult_relationship_id", generator: "assigned"
		version false
	}

	static constraints = {
		value nullable: true
		rank unique: ["type_id", "object_id", "subject_id"]
	}
}
