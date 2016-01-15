package org.gmod.chado

class NdExperimentContact {

	Contact contact
	NdExperiment ndExperiment

	static belongsTo = [Contact, NdExperiment]

	static mapping = {
		id column: "nd_experiment_contact_id", generator: "assigned"
		version false
	}
}
