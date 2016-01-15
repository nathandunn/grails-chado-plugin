package org.gmod.chado

class StockRelationshipPub {

	Pub pub
	StockRelationship stockRelationship

	static belongsTo = [Pub, StockRelationship]

	static mapping = {
		id column: "stock_relationship_pub_id", generator: "assigned"
		version false
	}
}
