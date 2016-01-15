package org.gmod.chado

class NdProtocolReagent {

	NdReagent ndReagent
	NdProtocol ndProtocol
	Cvterm cvterm

	static belongsTo = [Cvterm, NdProtocol, NdReagent]

	static mapping = {
		id column: "nd_protocol_reagent_id", generator: "assigned"
		version false
	}
}
