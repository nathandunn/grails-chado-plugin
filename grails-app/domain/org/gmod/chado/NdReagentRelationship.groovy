package org.gmod.chado

class NdReagentRelationship {

	NdReagent ndReagentByObjectReagentId
	NdReagent ndReagentBySubjectReagentId
	Cvterm cvterm

	static belongsTo = [Cvterm, NdReagent]

	static mapping = {
		id column: "nd_reagent_relationship_id", generator: "assigned"
		version false
	}
}
