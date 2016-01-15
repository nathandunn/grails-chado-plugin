package org.gmod.chado

class CellLineFeature {

	Pub pub
	Feature feature
	CellLine cellLine

	static belongsTo = [CellLine, Feature, Pub]

	static mapping = {
		id column: "cell_line_feature_id", generator: "assigned"
		version false
	}
}
