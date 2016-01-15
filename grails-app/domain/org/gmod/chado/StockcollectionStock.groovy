package org.gmod.chado

class StockcollectionStock {

	Stockcollection stockcollection
	Stock stock

	static belongsTo = [Stock, Stockcollection]

	static mapping = {
		id column: "stockcollection_stock_id", generator: "assigned"
		version false
	}
}
