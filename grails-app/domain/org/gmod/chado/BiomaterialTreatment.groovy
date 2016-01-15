package org.gmod.chado

class BiomaterialTreatment {

	Float value
	Integer rank
	Treatment treatment
	Cvterm cvterm
	Biomaterial biomaterial

	static belongsTo = [Biomaterial, Cvterm, Treatment]

	static mapping = {
		id column: "biomaterial_treatment_id", generator: "assigned"
		version false
	}

	static constraints = {
		value nullable: true, scale: 8
	}
}
