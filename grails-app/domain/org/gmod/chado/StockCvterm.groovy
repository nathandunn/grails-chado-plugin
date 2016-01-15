package org.gmod.chado

class StockCvterm {

	Boolean isNot
	Integer rank
	Pub pub
	Cvterm cvterm
	Stock stock

	static hasMany = [stockCvtermprops: StockCvtermprop]
	static belongsTo = [Cvterm, Pub, Stock]

	static mapping = {
		id column: "stock_cvterm_id", generator: "assigned"
		version false
	}

	static constraints = {
		rank unique: ["pub_id", "cvterm_id", "stock_id"]
	}
}
