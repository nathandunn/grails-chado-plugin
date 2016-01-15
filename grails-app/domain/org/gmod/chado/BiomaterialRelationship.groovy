package org.gmod.chado

class BiomaterialRelationship {

	Biomaterial biomaterialByObjectId
	Biomaterial biomaterialBySubjectId
	Cvterm cvterm

	static belongsTo = [Biomaterial, Cvterm]

	static mapping = {
		id column: "biomaterial_relationship_id", generator: "assigned"
		version false
	}
}
