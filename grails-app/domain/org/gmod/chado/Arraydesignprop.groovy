package org.gmod.chado

class Arraydesignprop {

	String value
	Integer rank
	Arraydesign arraydesign
	Cvterm cvterm

	static belongsTo = [Arraydesign, Cvterm]

	static mapping = {
		id column: "arraydesignprop_id", generator: "assigned"
		version false
	}

	static constraints = {
		value nullable: true
		rank unique: ["type_id", "arraydesign_id"]
	}
}
