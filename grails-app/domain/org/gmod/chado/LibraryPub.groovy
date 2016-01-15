package org.gmod.chado

class LibraryPub {

	Pub pub
	Library library

	static belongsTo = [Library, Pub]

	static mapping = {
		id column: "library_pub_id", generator: "assigned"
		version false
	}
}
