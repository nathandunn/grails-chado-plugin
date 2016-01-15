package org.gmod.chado

class Acquisition {

	Date acquisitiondate
	String name
	String uri
	Channel channel
	Protocol protocol
	Assay assay

	static hasMany = [acquisitionRelationshipsForObjectId: AcquisitionRelationship,
	                  acquisitionRelationshipsForSubjectId: AcquisitionRelationship,
	                  acquisitionprops: Acquisitionprop,
	                  quantifications: Quantification]
	static belongsTo = [Assay, Channel, Protocol]

	// TODO you have multiple hasMany references for class(es) [AcquisitionRelationship] 
	//      so you'll need to disambiguate them with the 'mappedBy' property:
	static mappedBy = [acquisitionRelationshipsForObjectId: "TODO",
	                   acquisitionRelationshipsForSubjectId: "TODO"]

	static mapping = {
		id column: "acquisition_id", generator: "assigned"
		version false
	}

	static constraints = {
		acquisitiondate nullable: true
		name nullable: true, unique: true
		uri nullable: true
	}
}
