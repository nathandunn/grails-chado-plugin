package org.gmod.chado

class Stockprop {

	String value
	Integer rank
	Stock stock
	Cvterm cvterm

	static hasMany = [stockpropPubs: StockpropPub]
	static belongsTo = [Cvterm, Stock]

	static mapping = {
		id column: "stockprop_id", generator: "assigned"
		version false
	}

	static constraints = {
		value nullable: true
		rank unique: ["type_id", "stock_id"]
	}
}
