package org.gmod.chado

class LibrarySynonym {

	Boolean isCurrent
	Boolean isInternal
	Pub pub
	Synonym synonym
	Library library

	static belongsTo = [Library, Pub, Synonym]

	static mapping = {
		id column: "library_synonym_id", generator: "assigned"
		version false
	}
}
