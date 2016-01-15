package org.gmod.chado

class Contact {

	String name
	String description
	Cvterm cvterm

	static hasMany = [
//			arraydesigns: Arraydesign,
//	                  assays: Assay,
//	                  biomaterials: Biomaterial,
	                  contactRelationshipsForObjectId: ContactRelationship,
	                  contactRelationshipsForSubjectId: ContactRelationship,
	                  ndExperimentContacts: NdExperimentContact,
	                  projectContacts: ProjectContact,
//	                  quantifications: Quantification,
	                  stockcollections: Stockcollection
//	                  studies: Study
	]
	static belongsTo = [Cvterm]

	// TODO you have multiple hasMany references for class(es) [ContactRelationship] 
	//      so you'll need to disambiguate them with the 'mappedBy' property:
	static mappedBy = [contactRelationshipsForObjectId: "contactByObjectId",
	                   contactRelationshipsForSubjectId: "contactBySubjectId"]

	static mapping = {
		id column: "contact_id", generator: "assigned"
		version false
	}

	static constraints = {
		name unique: true
		description nullable: true
	}
}
