package org.gmod.chado

class AcquisitionRelationship {

	String value
	Integer rank
	Acquisition acquisitionBySubjectId
	Acquisition acquisitionByObjectId
	Cvterm cvterm

	static belongsTo = [Acquisition, Cvterm]

	static mapping = {
		id column: "acquisition_relationship_id", generator: "assigned"
		version false
	}

	static constraints = {
		value nullable: true
		rank unique: ["type_id", "object_id", "subject_id"]
	}
}
