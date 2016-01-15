package org.gmod.chado

class ElementRelationship {

	String value
	Integer rank
	Element elementByObjectId
	Element elementBySubjectId
	Cvterm cvterm

	static belongsTo = [Cvterm, Element]

	static mapping = {
		id column: "element_relationship_id", generator: "assigned"
		version false
	}

	static constraints = {
		value nullable: true
		rank unique: ["type_id", "object_id", "subject_id"]
	}
}
