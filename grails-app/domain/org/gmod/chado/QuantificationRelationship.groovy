package org.gmod.chado

class QuantificationRelationship {

	Quantification quantificationByObjectId
	Quantification quantificationBySubjectId
	Cvterm cvterm

	static belongsTo = [Cvterm, Quantification]

	static mapping = {
		id column: "quantification_relationship_id", generator: "assigned"
		version false
	}
}
