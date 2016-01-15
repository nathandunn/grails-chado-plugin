package org.gmod.chado

class NdExperimentPhenotype {

	Phenotype phenotype
	NdExperiment ndExperiment

	static belongsTo = [NdExperiment, Phenotype]

	static mapping = {
		id column: "nd_experiment_phenotype_id", generator: "assigned"
		version false
	}
}
