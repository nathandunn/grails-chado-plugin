package org.gmod.chado

class LibraryDbxref {

	Boolean isCurrent
	Dbxref dbxref
	Library library

	static belongsTo = [Dbxref, Library]

	static mapping = {
		id column: "library_dbxref_id", generator: "assigned"
		version false
	}
}
