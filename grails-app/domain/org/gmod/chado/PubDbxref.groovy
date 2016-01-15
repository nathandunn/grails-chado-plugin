package org.gmod.chado

class PubDbxref {

	Boolean isCurrent
	Pub pub
	Dbxref dbxref

	static belongsTo = [Dbxref, Pub]

	static mapping = {
		id column: "pub_dbxref_id", generator: "assigned"
		version false
	}
}
