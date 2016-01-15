package org.gmod.chado

class Quantification {

	Date quantificationdate
	String name
	String uri
	Contact contact
	Acquisition acquisition
	Protocol protocol
	Analysis analysis

	static hasMany = [elementresults: Elementresult,
	                  quantificationRelationshipsForObjectId: QuantificationRelationship,
	                  quantificationRelationshipsForSubjectId: QuantificationRelationship,
	                  quantificationprops: Quantificationprop]
	static belongsTo = [Acquisition, Analysis, Contact, Protocol]

	// TODO you have multiple hasMany references for class(es) [QuantificationRelationship] 
	//      so you'll need to disambiguate them with the 'mappedBy' property:
	static mappedBy = [quantificationRelationshipsForObjectId: "TODO",
	                   quantificationRelationshipsForSubjectId: "TODO"]

	static mapping = {
		id column: "quantification_id", generator: "assigned"
		version false
	}

	static constraints = {
		quantificationdate nullable: true
		name nullable: true
		uri nullable: true
	}
}
