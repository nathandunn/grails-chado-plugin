package org.gmod.chado

class Study {

	String name
	String description
	Pub pub
	Dbxref dbxref
	Contact contact

	static hasMany = [studyAssays: StudyAssay,
	                  studydesigns: Studydesign,
	                  studyprops: Studyprop]
	static belongsTo = [Contact, Dbxref, Pub]

	static mapping = {
		id column: "study_id", generator: "assigned"
		version false
	}

	static constraints = {
		name unique: true
		description nullable: true
	}
}
