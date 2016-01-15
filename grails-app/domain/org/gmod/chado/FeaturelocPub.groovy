package org.gmod.chado

class FeaturelocPub {

	Pub pub
	Featureloc featureloc

	static belongsTo = [Featureloc, Pub]

	static mapping = {
		id column: "featureloc_pub_id", generator: "assigned"
		version false
	}
}
