package org.gmod.chado

class StockPub {

	Pub pub
	Stock stock

	static belongsTo = [Pub, Stock]

	static mapping = {
		id column: "stock_pub_id", generator: "assigned"
		version false
	}
}
