package org.gmod.chado

class PhenotypeComparison {

	Pub pub
	Environment environmentByEnvironment2Id
	Environment environmentByEnvironment1Id
	Genotype genotypeByGenotype1Id
	Organism organism
	Phenotype phenotypeByPhenotype2Id
	Phenotype phenotypeByPhenotype1Id
	Genotype genotypeByGenotype2Id

	static hasMany = [phenotypeComparisonCvterms: PhenotypeComparisonCvterm]
	static belongsTo = [Environment, Genotype, Organism, Phenotype, Pub]

	static mapping = {
		id column: "phenotype_comparison_id", generator: "assigned"
		version false
	}
}
