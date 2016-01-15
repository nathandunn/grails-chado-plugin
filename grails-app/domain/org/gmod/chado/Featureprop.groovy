package org.gmod.chado

class Featureprop {

	String value
	Integer rank
	Feature feature
	Cvterm cvterm

	static hasMany = [featurepropPubs: FeaturepropPub]
	static belongsTo = [Cvterm, Feature]

	static mapping = {
		id column: "featureprop_id", generator: "assigned"
		version false
	}

	static constraints = {
		value nullable: true
		rank unique: ["type_id", "feature_id"]
	}
}
