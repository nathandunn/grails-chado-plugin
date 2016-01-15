package org.gmod.chado

class Analysisprop {

	String value
	Integer rank
	Analysis analysis
	Cvterm cvterm

	static belongsTo = [Analysis, Cvterm]

	static mapping = {
		id column: "analysisprop_id", generator: "assigned"
		version false
	}

	static constraints = {
		value nullable: true
		rank unique: ["type_id", "analysis_id"]
	}
}
