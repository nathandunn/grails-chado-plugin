package org.gmod.chado

class NdExperimentProtocol {

	NdProtocol ndProtocol
	NdExperiment ndExperiment

	static belongsTo = [NdExperiment, NdProtocol]

	static mapping = {
		id column: "nd_experiment_protocol_id", generator: "assigned"
		version false
	}
}
