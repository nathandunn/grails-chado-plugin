package org.gmod.chado

class NdExperiment {

	NdGeolocation ndGeolocation
	Cvterm cvterm

	static hasMany = [ndExperimentContacts: NdExperimentContact,
	                  ndExperimentDbxrefs: NdExperimentDbxref,
	                  ndExperimentGenotypes: NdExperimentGenotype,
	                  ndExperimentPhenotypes: NdExperimentPhenotype,
	                  ndExperimentProjects: NdExperimentProject,
	                  ndExperimentProtocols: NdExperimentProtocol,
	                  ndExperimentPubs: NdExperimentPub,
	                  ndExperimentStocks: NdExperimentStock,
	                  ndExperimentprops: NdExperimentprop]
	static belongsTo = [Cvterm, NdGeolocation]

	static mapping = {
		id column: "nd_experiment_id", generator: "assigned"
		version false
	}
}
