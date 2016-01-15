package org.gmod.chado

class NdExperimentProject {

	Project project
	NdExperiment ndExperiment

	static belongsTo = [NdExperiment, Project]

	static mapping = {
		id column: "nd_experiment_project_id", generator: "assigned"
		version false
	}
}
