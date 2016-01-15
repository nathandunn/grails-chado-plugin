package org.gmod.chado

class AssayBiomaterial {

	Integer rank
	Biomaterial biomaterial
	Channel channel
	Assay assay

	static belongsTo = [Assay, Biomaterial, Channel]

	static mapping = {
		id column: "assay_biomaterial_id", generator: "assigned"
		version false
	}

	static constraints = {
		rank unique: ["channel_id", "biomaterial_id", "assay_id"]
	}
}
