package org.gmod.chado

class Chadoprop {

	String value
	Integer rank
	Cvterm cvterm

	static belongsTo = [Cvterm]

	static mapping = {
		id column: "chadoprop_id", generator: "assigned"
		version false
	}

	static constraints = {
		value nullable: true
		rank unique: ["type_id"]
	}
}
