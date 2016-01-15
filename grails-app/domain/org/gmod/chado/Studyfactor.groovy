package org.gmod.chado

class Studyfactor {

	String name
	String description
	Studydesign studydesign
	Cvterm cvterm

	static hasMany = [studyfactorvalues: Studyfactorvalue]
	static belongsTo = [Cvterm, Studydesign]

	static mapping = {
		id column: "studyfactor_id", generator: "assigned"
		version false
	}

	static constraints = {
		description nullable: true
	}
}
