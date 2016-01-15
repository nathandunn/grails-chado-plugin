package org.gmod.chado

class StockRelationshipCvterm {

	Pub pub
	StockRelationship stockRelationship
	Cvterm cvterm

	static belongsTo = [Cvterm, Pub, StockRelationship]

	static mapping = {
		id column: "stock_relationship_cvterm_id", generator: "assigned"
		version false
	}
}
