package org.gmod.chado

class FeaturePubprop {

	String value
	Integer rank
	FeaturePub featurePub
	Cvterm cvterm

	static belongsTo = [Cvterm, FeaturePub]

	static mapping = {
		id column: "feature_pubprop_id", generator: "assigned"
		version false
	}

	static constraints = {
		value nullable: true
		rank unique: ["type_id", "feature_pub_id"]
	}
}
