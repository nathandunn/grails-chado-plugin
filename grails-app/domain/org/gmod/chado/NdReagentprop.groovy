package org.gmod.chado

class NdReagentprop {

	String value
	Integer rank
	NdReagent ndReagent
	Cvterm cvterm

	static belongsTo = [Cvterm, NdReagent]

	static mapping = {
		id column: "nd_reagentprop_id", generator: "assigned"
		version false
	}

	static constraints = {
		value nullable: true
		rank unique: ["type_id", "nd_reagent_id"]
	}
}
