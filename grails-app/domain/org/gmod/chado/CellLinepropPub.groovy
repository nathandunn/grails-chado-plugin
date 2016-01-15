package org.gmod.chado

class CellLinepropPub {

	Pub pub
	CellLineprop cellLineprop

	static belongsTo = [CellLineprop, Pub]

	static mapping = {
		id column: "cell_lineprop_pub_id", generator: "assigned"
		version false
	}
}
