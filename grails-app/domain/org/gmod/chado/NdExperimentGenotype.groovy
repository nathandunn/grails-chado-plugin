package org.gmod.chado

class NdExperimentGenotype {

	Genotype genotype
	NdExperiment ndExperiment

	static belongsTo = [Genotype, NdExperiment]

	static mapping = {
		id column: "nd_experiment_genotype_id", generator: "assigned"
		version false
	}
}
