package org.gmod.chado

class Biomaterialprop {

	String value
	Integer rank
	Biomaterial biomaterial
	Cvterm cvterm

	static belongsTo = [Biomaterial, Cvterm]

	static mapping = {
		id column: "biomaterialprop_id", generator: "assigned"
		version false
	}

	static constraints = {
		value nullable: true
		rank unique: ["type_id", "biomaterial_id"]
	}
}
