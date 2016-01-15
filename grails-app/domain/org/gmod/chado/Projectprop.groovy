package org.gmod.chado

class Projectprop {

	String value
	Integer rank
	Project project
	Cvterm cvterm

	static belongsTo = [Cvterm, Project]

	static mapping = {
		id column: "projectprop_id", generator: "assigned"
		version false
	}

	static constraints = {
		value nullable: true
		rank unique: ["type_id", "project_id"]
	}
}
