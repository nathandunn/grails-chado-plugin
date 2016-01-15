package org.gmod.chado

class TmpCdsHandler {

	String seqId
	String gffId
	String type
	Integer fmin
	Integer fmax
	String object

	static hasMany = [tmpCdsHandlerRelationships: TmpCdsHandlerRelationship]

	static mapping = {
		id column: "cds_row_id", generator: "assigned"
		version false
	}

	static constraints = {
		seqId nullable: true, maxSize: 1024
		gffId nullable: true, maxSize: 1024
		type maxSize: 1024
	}
}
