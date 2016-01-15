package org.gmod.chado

class Protocolparam {

	String name
	String value
	Integer rank
	Cvterm cvtermByUnittypeId
	Protocol protocol
	Cvterm cvtermByDatatypeId

	static belongsTo = [Cvterm, Protocol]

	static mapping = {
		id column: "protocolparam_id", generator: "assigned"
		version false
	}

	static constraints = {
		value nullable: true
	}
}
