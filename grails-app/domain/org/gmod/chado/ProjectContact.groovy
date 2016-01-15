package org.gmod.chado

class ProjectContact {

	Project project
	Contact contact

	static belongsTo = [Contact, Project]

	static mapping = {
		id column: "project_contact_id", generator: "assigned"
		version false
	}
}
