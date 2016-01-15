package org.gmod.chado

class OrganismDbxref {

	Dbxref dbxref
	Organism organism

	static belongsTo = [Dbxref, Organism]

	static mapping = {
		id column: "organism_dbxref_id", generator: "assigned"
		version false
	}
}
