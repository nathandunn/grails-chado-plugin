package org.gmod.chado

class Assayprop {

	String value
	Integer rank
	Assay assay
	Cvterm cvterm

	static belongsTo = [Assay, Cvterm]

	static mapping = {
		id column: "assayprop_id", generator: "assigned"
		version false
	}

	static constraints = {
		value nullable: true
		rank unique: ["type_id", "assay_id"]
	}
}
