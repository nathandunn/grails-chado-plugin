package org.gmod.chado

class StockDbxref {

	Boolean isCurrent
	Dbxref dbxref
	Stock stock

	static hasMany = [stockDbxrefprops: StockDbxrefprop]
	static belongsTo = [Dbxref, Stock]

	static mapping = {
		id column: "stock_dbxref_id", generator: "assigned"
		version false
	}
}
