package org.gmod.chado

class FeatureCvtermPub {

	Pub pub
	FeatureCvterm featureCvterm

	static belongsTo = [FeatureCvterm, Pub]

	static mapping = {
		id column: "feature_cvterm_pub_id", generator: "assigned"
		version false
	}
}
