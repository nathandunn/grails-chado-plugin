package org.gmod.chado

class Cvtermsynonym {

	String synonym
	Cvterm cvtermByCvtermId
	Cvterm cvtermByTypeId

	static belongsTo = [Cvterm]

	static mapping = {
		id column: "cvtermsynonym_id", generator: "assigned"
		version false
	}

	static constraints = {
		synonym maxSize: 1024, unique: ["cvterm_id"]
	}
}
