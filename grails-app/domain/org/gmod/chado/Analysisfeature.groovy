package org.gmod.chado

class Analysisfeature {

	Double rawscore
	Double normscore
	Double significance
	Double identity
	Feature feature
	Analysis analysis

	static hasMany = [analysisfeatureprops: Analysisfeatureprop]
	static belongsTo = [Analysis, Feature]

	static mapping = {
		id column: "analysisfeature_id", generator: "assigned"
		version false
	}

	static constraints = {
		rawscore nullable: true, scale: 17
		normscore nullable: true, scale: 17
		significance nullable: true, scale: 17
		identity nullable: true, scale: 17
	}
}
