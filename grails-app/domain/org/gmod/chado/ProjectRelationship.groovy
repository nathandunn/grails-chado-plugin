package org.gmod.chado

class ProjectRelationship {

	Project projectByObjectProjectId
	Project projectBySubjectProjectId
	Cvterm cvterm

	static belongsTo = [Cvterm, Project]

	static mapping = {
		id column: "project_relationship_id", generator: "assigned"
		version false
	}
}
