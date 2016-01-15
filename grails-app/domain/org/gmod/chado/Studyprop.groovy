package org.gmod.chado

class Studyprop {

	String value
	Integer rank
	Study study
	Cvterm cvterm

	static hasMany = [studypropFeatures: StudypropFeature]
	static belongsTo = [Cvterm, Study]

	static mapping = {
		id column: "studyprop_id", generator: "assigned"
		version false
	}

	static constraints = {
		value nullable: true
		rank unique: ["type_id", "study_id"]
	}
}
