package org.gmod.chado

class StockDbxrefprop {

	String value
	Integer rank
	StockDbxref stockDbxref
	Cvterm cvterm

	static belongsTo = [Cvterm, StockDbxref]

	static mapping = {
		id column: "stock_dbxrefprop_id", generator: "assigned"
		version false
	}

	static constraints = {
		value nullable: true
		rank unique: ["type_id", "stock_dbxref_id"]
	}
}
