package org.gmod.chado

class Analysisfeatureprop {

	String value
	Integer rank
	Analysisfeature analysisfeature
	Cvterm cvterm

	static belongsTo = [Analysisfeature, Cvterm]

	static mapping = {
		id column: "analysisfeatureprop_id", generator: "assigned"
		version false
	}

	static constraints = {
		value nullable: true
		rank unique: ["type_id", "analysisfeature_id"]
	}
}
