package org.gmod.chado

class NdGeolocation {

	String description
	Float latitude
	Float longitude
	String geodeticDatum
	Float altitude

	static hasMany = [ndExperiments: NdExperiment,
	                  ndGeolocationprops: NdGeolocationprop]

	static mapping = {
		id column: "nd_geolocation_id", generator: "assigned"
		version false
	}

	static constraints = {
		description nullable: true
		latitude nullable: true, scale: 8
		longitude nullable: true, scale: 8
		geodeticDatum nullable: true, maxSize: 32
		altitude nullable: true, scale: 8
	}
}
