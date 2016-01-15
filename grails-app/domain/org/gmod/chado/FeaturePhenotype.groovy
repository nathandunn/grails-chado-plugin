package org.gmod.chado

class FeaturePhenotype {

	Feature feature
	Phenotype phenotype

	static belongsTo = [Feature, Phenotype]

	static mapping = {
		id column: "feature_phenotype_id", generator: "assigned"
		version false
	}
}
