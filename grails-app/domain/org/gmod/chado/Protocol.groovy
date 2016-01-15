package org.gmod.chado

class Protocol {

	String name
	String uri
	String protocoldescription
	String hardwaredescription
	String softwaredescription
	Pub pub
	Dbxref dbxref
	Cvterm cvterm

	static hasMany = [acquisitions: Acquisition,
	                  arraydesigns: Arraydesign,
	                  assays: Assay,
	                  protocolparams: Protocolparam,
	                  quantifications: Quantification,
	                  treatments: Treatment]
	static belongsTo = [Cvterm, Dbxref, Pub]

	static mapping = {
		id column: "protocol_id", generator: "assigned"
		version false
	}

	static constraints = {
		name unique: true
		uri nullable: true
		protocoldescription nullable: true
		hardwaredescription nullable: true
		softwaredescription nullable: true
	}
}
