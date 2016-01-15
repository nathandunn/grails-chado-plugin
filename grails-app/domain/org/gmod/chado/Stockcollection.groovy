package org.gmod.chado

class Stockcollection {

	String name
	String uniquename
	Contact contact
	Cvterm cvterm

	static hasMany = [stockcollectionStocks: StockcollectionStock,
	                  stockcollectionprops: Stockcollectionprop]
	static belongsTo = [Contact, Cvterm]

	static mapping = {
		id column: "stockcollection_id", generator: "assigned"
		version false
	}

	static constraints = {
		name nullable: true
	}
}
