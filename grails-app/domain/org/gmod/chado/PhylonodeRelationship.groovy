package org.gmod.chado

class PhylonodeRelationship {

	Integer rank
	Phylonode phylonodeByObjectId
	Phylotree phylotree
	Phylonode phylonodeBySubjectId
	Cvterm cvterm

	static belongsTo = [Cvterm, Phylonode, Phylotree]

	static mapping = {
		id column: "phylonode_relationship_id", generator: "assigned"
		version false
	}

	static constraints = {
		rank nullable: true
	}
}
