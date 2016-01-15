package org.gmod.chado

class NdProtocolprop {

	String value
	Integer rank
	NdProtocol ndProtocol
	Cvterm cvterm

	static belongsTo = [Cvterm, NdProtocol]

	static mapping = {
		id column: "nd_protocolprop_id", generator: "assigned"
		version false
	}

	static constraints = {
		value nullable: true
		rank unique: ["type_id", "nd_protocol_id"]
	}
}
