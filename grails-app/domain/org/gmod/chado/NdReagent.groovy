package org.gmod.chado

class NdReagent {

	String name
	Integer featureId
	Cvterm cvterm

	static hasMany = [ndProtocolReagents: NdProtocolReagent,
	                  ndReagentRelationshipsForObjectReagentId: NdReagentRelationship,
	                  ndReagentRelationshipsForSubjectReagentId: NdReagentRelationship,
	                  ndReagentprops: NdReagentprop]
	static belongsTo = [Cvterm]

	// TODO you have multiple hasMany references for class(es) [NdReagentRelationship] 
	//      so you'll need to disambiguate them with the 'mappedBy' property:
	static mappedBy = [ndReagentRelationshipsForObjectReagentId: "ndReagentByObjectReagentId",
	                   ndReagentRelationshipsForSubjectReagentId: "ndReagentBySubjectReagentId"]

	static mapping = {
		id column: "nd_reagent_id", generator: "assigned"
		version false
	}

	static constraints = {
		name maxSize: 80
		featureId nullable: true
	}
}
