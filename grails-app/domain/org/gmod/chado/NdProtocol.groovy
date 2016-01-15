package org.gmod.chado

class NdProtocol {

	String name
	Cvterm cvterm

	static hasMany = [ndExperimentProtocols: NdExperimentProtocol,
	                  ndProtocolReagents: NdProtocolReagent,
	                  ndProtocolprops: NdProtocolprop]
	static belongsTo = [Cvterm]

	static mapping = {
		id column: "nd_protocol_id", generator: "assigned"
		version false
	}

	static constraints = {
		name unique: true
	}
}
