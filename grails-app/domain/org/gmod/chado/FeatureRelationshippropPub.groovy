package org.gmod.chado

class FeatureRelationshippropPub {

	Pub pub
	FeatureRelationshipprop featureRelationshipprop

	static belongsTo = [FeatureRelationshipprop, Pub]

	static mapping = {
		id column: "feature_relationshipprop_pub_id", generator: "assigned"
		version false
	}
}
