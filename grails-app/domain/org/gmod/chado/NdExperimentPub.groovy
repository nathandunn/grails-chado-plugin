package org.gmod.chado

class NdExperimentPub {

	Pub pub
	NdExperiment ndExperiment

	static belongsTo = [NdExperiment, Pub]

	static mapping = {
		id column: "nd_experiment_pub_id", generator: "assigned"
		version false
	}
}
