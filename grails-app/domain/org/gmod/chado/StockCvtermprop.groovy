package org.gmod.chado

class StockCvtermprop {

	String value
	Integer rank
	StockCvterm stockCvterm
	Cvterm cvterm

	static belongsTo = [Cvterm, StockCvterm]

	static mapping = {
		id column: "stock_cvtermprop_id", generator: "assigned"
		version false
	}

	static constraints = {
		value nullable: true
		rank unique: ["type_id", "stock_cvterm_id"]
	}
}
