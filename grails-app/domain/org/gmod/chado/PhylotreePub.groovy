package org.gmod.chado

class PhylotreePub {

	Pub pub
	Phylotree phylotree

	static belongsTo = [Phylotree, Pub]

	static mapping = {
		id column: "phylotree_pub_id", generator: "assigned"
		version false
	}
}
