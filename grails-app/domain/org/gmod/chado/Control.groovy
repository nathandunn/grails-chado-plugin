package org.gmod.chado

class Control {

	Integer rowId
	String name
	String value
	Integer rank
	Tableinfo tableinfo
	Assay assay
	Cvterm cvterm

	static belongsTo = [Assay, Cvterm, Tableinfo]

	static mapping = {
		id column: "control_id", generator: "assigned"
		version false
	}

	static constraints = {
		name nullable: true
		value nullable: true
	}
}
