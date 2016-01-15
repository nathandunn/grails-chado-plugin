package org.gmod.chado

class FeaturepropPub {

	Pub pub
	Featureprop featureprop

	static belongsTo = [Featureprop, Pub]

	static mapping = {
		id column: "featureprop_pub_id", generator: "assigned"
		version false
	}
}
