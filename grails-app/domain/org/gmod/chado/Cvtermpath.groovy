package org.gmod.chado

class Cvtermpath {

	Integer pathdistance
	Cvterm cvtermBySubjectId
	Cvterm cvtermByObjectId
	Cv cv
	Cvterm cvtermByTypeId

	static belongsTo = [Cv, Cvterm]

	static mapping = {
		id column: "cvtermpath_id", generator: "assigned"
		version false
	}

	static constraints = {
		pathdistance nullable: true, unique: ["type_id", "object_id", "subject_id"]
	}
}
