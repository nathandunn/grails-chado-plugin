package org.gmod.chado

class FeaturemapPub {

	Pub pub
	Featuremap featuremap

	static belongsTo = [Featuremap, Pub]

	static mapping = {
		id column: "featuremap_pub_id", generator: "assigned"
		version false
	}
}
