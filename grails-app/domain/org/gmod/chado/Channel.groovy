package org.gmod.chado

class Channel {

	String name
	String definition

	static hasMany = [acquisitions: Acquisition,
	                  assayBiomaterials: AssayBiomaterial]

	static mapping = {
		id column: "channel_id", generator: "assigned"
		version false
	}

	static constraints = {
		name unique: true
	}
}
