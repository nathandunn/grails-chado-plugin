package org.gmod.chado

class LibraryCvterm {

	Pub pub
	Cvterm cvterm
	Library library

	static belongsTo = [Cvterm, Library, Pub]

	static mapping = {
		id column: "library_cvterm_id", generator: "assigned"
		version false
	}
}
