package org.gmod.chado

class FeatureSynonym {

	Boolean isCurrent
	Boolean isInternal
	Pub pub
	Feature feature
	Synonym synonym

	static belongsTo = [Feature, Pub, Synonym]

	static mapping = {
		id column: "feature_synonym_id", generator: "assigned"
		version false
	}
}
