package org.gmod.chado

class Stockcollectionprop {

	String value
	Integer rank
	Stockcollection stockcollection
	Cvterm cvterm

	static belongsTo = [Cvterm, Stockcollection]

	static mapping = {
		id column: "stockcollectionprop_id", generator: "assigned"
		version false
	}

	static constraints = {
		value nullable: true
		rank unique: ["type_id", "stockcollection_id"]
	}
}
