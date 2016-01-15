package org.gmod.chado

class CellLinePub {

	Pub pub
	CellLine cellLine

	static belongsTo = [CellLine, Pub]

	static mapping = {
		id column: "cell_line_pub_id", generator: "assigned"
		version false
	}
}
