package org.gmod.chado

class FeaturePub {

	Pub pub
	Feature feature

	static hasMany = [featurePubprops: FeaturePubprop]
	static belongsTo = [Feature, Pub]

	static mapping = {
		id column: "feature_pub_id", generator: "assigned"
		version false
	}
}
