package org.gmod.chado

class Treatment {

	Integer rank
	String name
	Biomaterial biomaterial
	Protocol protocol
	Cvterm cvterm

	static hasMany = [biomaterialTreatments: BiomaterialTreatment]
	static belongsTo = [Biomaterial, Cvterm, Protocol]

	static mapping = {
		id column: "treatment_id", generator: "assigned"
		version false
	}

	static constraints = {
		name nullable: true
	}
}
