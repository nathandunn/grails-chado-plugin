package org.gmod.chado

class LibraryFeature {

	Feature feature
	Library library

	static belongsTo = [Feature, Library]

	static mapping = {
		id column: "library_feature_id", generator: "assigned"
		version false
	}
}
