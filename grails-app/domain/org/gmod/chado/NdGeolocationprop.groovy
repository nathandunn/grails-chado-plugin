package org.gmod.chado

class NdGeolocationprop {

	String value
	Integer rank
	NdGeolocation ndGeolocation
	Cvterm cvterm

	static belongsTo = [Cvterm, NdGeolocation]

	static mapping = {
		id column: "nd_geolocationprop_id", generator: "assigned"
		version false
	}

	static constraints = {
		value nullable: true
		rank unique: ["type_id", "nd_geolocation_id"]
	}
}
