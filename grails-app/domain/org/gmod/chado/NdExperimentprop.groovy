package org.gmod.chado

class NdExperimentprop {

	String value
	Integer rank
	NdExperiment ndExperiment
	Cvterm cvterm

	static belongsTo = [Cvterm, NdExperiment]

	static mapping = {
		id column: "nd_experimentprop_id", generator: "assigned"
		version false
	}

	static constraints = {
		value nullable: true
		rank unique: ["type_id", "nd_experiment_id"]
	}
}
