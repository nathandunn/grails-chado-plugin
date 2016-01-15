package org.gmod.chado

class PhylonodeOrganism {

	Organism organism
	Phylonode phylonode

	static belongsTo = [Organism, Phylonode]

	static mapping = {
		id column: "phylonode_organism_id", generator: "assigned"
		version false
	}
}
