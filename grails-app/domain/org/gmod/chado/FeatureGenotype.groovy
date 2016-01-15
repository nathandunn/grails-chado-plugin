package org.gmod.chado

class FeatureGenotype {

	Integer rank
	Integer cgroup
	Feature featureByFeatureId
	Genotype genotype
	Cvterm cvterm
	Feature featureByChromosomeId

	static belongsTo = [Cvterm, Feature, Genotype]

	static mapping = {
		id column: "feature_genotype_id", generator: "assigned"
		version false
	}

	static constraints = {
		cgroup unique: ["rank", "chromosome_id", "cvterm_id", "genotype_id", "feature_id"]
	}
}
