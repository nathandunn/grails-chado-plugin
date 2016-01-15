package org.gmod.chado

class Studydesignprop {

	String value
	Integer rank
	Studydesign studydesign
	Cvterm cvterm

	static belongsTo = [Cvterm, Studydesign]

	static mapping = {
		id column: "studydesignprop_id", generator: "assigned"
		version false
	}

	static constraints = {
		value nullable: true
		rank unique: ["type_id", "studydesign_id"]
	}
}
