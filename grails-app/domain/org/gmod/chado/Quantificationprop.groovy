package org.gmod.chado

class Quantificationprop {

	String value
	Integer rank
	Quantification quantification
	Cvterm cvterm

	static belongsTo = [Cvterm, Quantification]

	static mapping = {
		id column: "quantificationprop_id", generator: "assigned"
		version false
	}

	static constraints = {
		value nullable: true
		rank unique: ["type_id", "quantification_id"]
	}
}
