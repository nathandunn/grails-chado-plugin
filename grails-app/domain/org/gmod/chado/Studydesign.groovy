package org.gmod.chado

class Studydesign {

	String description
	Study study

	static hasMany = [studydesignprops: Studydesignprop,
	                  studyfactors: Studyfactor]
	static belongsTo = [Study]

	static mapping = {
		id column: "studydesign_id", generator: "assigned"
		version false
	}

	static constraints = {
		description nullable: true
	}
}
