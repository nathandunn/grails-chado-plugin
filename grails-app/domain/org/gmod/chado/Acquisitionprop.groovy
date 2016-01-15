package org.gmod.chado

class Acquisitionprop {

	String value
	Integer rank
	Acquisition acquisition
	Cvterm cvterm

	static belongsTo = [Acquisition, Cvterm]

	static mapping = {
		id column: "acquisitionprop_id", generator: "assigned"
		version false
	}

	static constraints = {
		value nullable: true
		rank unique: ["type_id", "acquisition_id"]
	}
}
