package org.gmod.chado

class Cvtermprop {

	String value
	Integer rank
	Cvterm cvtermByCvtermId
	Cvterm cvtermByTypeId

	static belongsTo = [Cvterm]

	static mapping = {
		id column: "cvtermprop_id", generator: "assigned"
		version false
	}

	static constraints = {
		rank unique: ["value", "type_id", "cvterm_id"]
	}
}
