package org.gmod.chado

class StockGenotype {

	Genotype genotype
	Stock stock

	static belongsTo = [Genotype, Stock]

	static mapping = {
		id column: "stock_genotype_id", generator: "assigned"
		version false
	}
}
