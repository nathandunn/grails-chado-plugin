package org.gmod.chado

class AssayProject {

	Project project
	Assay assay

	static belongsTo = [Assay, Project]

	static mapping = {
		id column: "assay_project_id", generator: "assigned"
		version false
	}
}
