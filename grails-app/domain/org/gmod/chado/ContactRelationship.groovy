package org.gmod.chado

class ContactRelationship {

	Contact contactBySubjectId
	Contact contactByObjectId
	Cvterm cvterm

	static belongsTo = [Contact, Cvterm]

	static mapping = {
		id column: "contact_relationship_id", generator: "assigned"
		version false
	}
}
