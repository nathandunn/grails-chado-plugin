package org.gmod.chado

class CellLineRelationship {

	CellLine cellLineByObjectId
	CellLine cellLineBySubjectId
	Cvterm cvterm

	static belongsTo = [CellLine, Cvterm]

	static mapping = {
		id column: "cell_line_relationship_id", generator: "assigned"
		version false
	}
}
