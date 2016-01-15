package org.gmod.chado

class FeatureRelationshipPub {

	Pub pub
	FeatureRelationship featureRelationship

	static belongsTo = [FeatureRelationship, Pub]

	static mapping = {
		id column: "feature_relationship_pub_id", generator: "assigned"
		version false
	}
}
