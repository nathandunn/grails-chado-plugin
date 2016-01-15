package org.gmod.chado

class StockpropPub {

	Pub pub
	Stockprop stockprop

	static belongsTo = [Pub, Stockprop]

	static mapping = {
		id column: "stockprop_pub_id", generator: "assigned"
		version false
	}
}
