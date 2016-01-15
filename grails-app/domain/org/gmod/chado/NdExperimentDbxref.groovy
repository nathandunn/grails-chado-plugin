package org.gmod.chado

class NdExperimentDbxref {

	Dbxref dbxref
	NdExperiment ndExperiment

	static belongsTo = [Dbxref, NdExperiment]

	static mapping = {
		id column: "nd_experiment_dbxref_id", generator: "assigned"
		version false
	}
}
