package org.gmod.chado

class CellLineCvterm {

	Integer rank
	Pub pub
	Cvterm cvterm
	CellLine cellLine

	static hasMany = [cellLineCvtermprops: CellLineCvtermprop]
	static belongsTo = [CellLine, Cvterm, Pub]

	static mapping = {
		id column: "cell_line_cvterm_id", generator: "assigned"
		version false
	}

	static constraints = {
		rank unique: ["pub_id", "cvterm_id", "cell_line_id"]
	}
}
