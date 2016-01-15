package org.gmod.chado

class StudypropFeature {

	Feature feature
	Studyprop studyprop
	Cvterm cvterm

	static belongsTo = [Cvterm, Feature, Studyprop]

	static mapping = {
		id column: "studyprop_feature_id", generator: "assigned"
		version false
	}
}
