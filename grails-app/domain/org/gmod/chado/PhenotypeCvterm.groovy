package org.gmod.chado

class PhenotypeCvterm {

	Integer rank
	Cvterm cvterm
	Phenotype phenotype

	static belongsTo = [Cvterm, Phenotype]

	static mapping = {
		id column: "phenotype_cvterm_id", generator: "assigned"
		version false
	}

	static constraints = {
		rank unique: ["cvterm_id", "phenotype_id"]
	}
}
