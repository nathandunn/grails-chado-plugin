package org.gmod.chado

class EnvironmentCvterm {

	Environment environment
	Cvterm cvterm

	static belongsTo = [Cvterm, Environment]

	static mapping = {
		id column: "environment_cvterm_id", generator: "assigned"
		version false
	}
}
