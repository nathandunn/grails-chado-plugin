package org.gmod.chado

class PhylonodeDbxref {

	Dbxref dbxref
	Phylonode phylonode

	static belongsTo = [Dbxref, Phylonode]

	static mapping = {
		id column: "phylonode_dbxref_id", generator: "assigned"
		version false
	}
}
