package org.gmod.chado

class BiomaterialDbxref {

	Dbxref dbxref
	Biomaterial biomaterial

	static belongsTo = [Biomaterial, Dbxref]

	static mapping = {
		id column: "biomaterial_dbxref_id", generator: "assigned"
		version false
	}
}
