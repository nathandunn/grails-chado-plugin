package org.gmod.chado

class CellLineCvtermprop {

	String value
	Integer rank
	CellLineCvterm cellLineCvterm
	Cvterm cvterm

	static belongsTo = [CellLineCvterm, Cvterm]

	static mapping = {
		id column: "cell_line_cvtermprop_id", generator: "assigned"
		version false
	}

	static constraints = {
		value nullable: true
		rank unique: ["type_id", "cell_line_cvterm_id"]
	}
}
