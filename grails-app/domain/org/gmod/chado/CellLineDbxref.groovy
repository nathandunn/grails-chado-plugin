package org.gmod.chado

class CellLineDbxref {

	Boolean isCurrent
	Dbxref dbxref
	CellLine cellLine

	static belongsTo = [CellLine, Dbxref]

	static mapping = {
		id column: "cell_line_dbxref_id", generator: "assigned"
		version false
	}
}
