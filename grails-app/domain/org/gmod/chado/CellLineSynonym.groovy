package org.gmod.chado

class CellLineSynonym {

	Boolean isCurrent
	Boolean isInternal
	Pub pub
	Synonym synonym
	CellLine cellLine

	static belongsTo = [CellLine, Pub, Synonym]

	static mapping = {
		id column: "cell_line_synonym_id", generator: "assigned"
		version false
	}
}
