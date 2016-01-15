package org.gmod.chado

class ProjectPub {

	Pub pub
	Project project

	static belongsTo = [Project, Pub]

	static mapping = {
		id column: "project_pub_id", generator: "assigned"
		version false
	}
}
