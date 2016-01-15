package org.gmod.chado

class Assay {

	Date assaydate
	String arrayidentifier
	String arraybatchidentifier
	String name
	String description
	Dbxref dbxref
	Contact contact
	Arraydesign arraydesign
	Protocol protocol

	static hasMany = [acquisitions: Acquisition,
	                  assayBiomaterials: AssayBiomaterial,
	                  assayProjects: AssayProject,
	                  assayprops: Assayprop,
	                  controls: Control,
	                  studyAssays: StudyAssay,
	                  studyfactorvalues: Studyfactorvalue]
	static belongsTo = [Arraydesign, Contact, Dbxref, Protocol]

	static mapping = {
		id column: "assay_id", generator: "assigned"
		version false
	}

	static constraints = {
		assaydate nullable: true
		arrayidentifier nullable: true
		arraybatchidentifier nullable: true
		name nullable: true, unique: true
		description nullable: true
	}
}
