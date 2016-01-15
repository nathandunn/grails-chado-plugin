package org.gmod.chado

class CellLineprop {

	String value
	Integer rank
	CellLine cellLine
	Cvterm cvterm

	static hasMany = [cellLinepropPubs: CellLinepropPub]
	static belongsTo = [CellLine, Cvterm]

	static mapping = {
		id column: "cell_lineprop_id", generator: "assigned"
		version false
	}

	static constraints = {
		value nullable: true
		rank unique: ["type_id", "cell_line_id"]
	}
}
