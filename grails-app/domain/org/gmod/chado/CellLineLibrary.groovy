package org.gmod.chado

class CellLineLibrary {

	Pub pub
	Library library
	CellLine cellLine

	static belongsTo = [CellLine, Library, Pub]

	static mapping = {
		id column: "cell_line_library_id", generator: "assigned"
		version false
	}
}
