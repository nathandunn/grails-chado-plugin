package org.gmod.chado

class Phylonodeprop {

	String value
	Integer rank
	Phylonode phylonode
	Cvterm cvterm

	static belongsTo = [Cvterm, Phylonode]

	static mapping = {
		id column: "phylonodeprop_id", generator: "assigned"
		version false
	}

	static constraints = {
		rank unique: ["value", "type_id", "phylonode_id"]
	}
}
