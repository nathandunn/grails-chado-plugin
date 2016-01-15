package org.gmod.chado

class StockRelationship {

	String value
	Integer rank
	Stock stockByObjectId
	Stock stockBySubjectId
	Cvterm cvterm

	static hasMany = [stockRelationshipCvterms: StockRelationshipCvterm,
	                  stockRelationshipPubs: StockRelationshipPub]
	static belongsTo = [Cvterm, Stock]

	static mapping = {
		id column: "stock_relationship_id", generator: "assigned"
		version false
	}

	static constraints = {
		value nullable: true
		rank unique: ["type_id", "object_id", "subject_id"]
	}
}
