package org.gmod.chado

class Biomaterial {

	String name
	String description
	Dbxref dbxref
	Contact contact
	Organism organism

	static hasMany = [assayBiomaterials: AssayBiomaterial,
	                  biomaterialDbxrefs: BiomaterialDbxref,
	                  biomaterialRelationshipsForObjectId: BiomaterialRelationship,
	                  biomaterialRelationshipsForSubjectId: BiomaterialRelationship,
	                  biomaterialTreatments: BiomaterialTreatment,
	                  biomaterialprops: Biomaterialprop,
	                  treatments: Treatment]
	static belongsTo = [Contact, Dbxref, Organism]

	// TODO you have multiple hasMany references for class(es) [BiomaterialRelationship] 
	//      so you'll need to disambiguate them with the 'mappedBy' property:
	static mappedBy = [biomaterialRelationshipsForObjectId: "TODO",
	                   biomaterialRelationshipsForSubjectId: "TODO"]

	static mapping = {
		id column: "biomaterial_id", generator: "assigned"
		version false
	}

	static constraints = {
		name nullable: true, unique: true
		description nullable: true
	}
}
