package org.gmod.chado

class NdExperimentStockDbxref {

	NdExperimentStock ndExperimentStock
	Dbxref dbxref

	static belongsTo = [Dbxref, NdExperimentStock]

	static mapping = {
		id column: "nd_experiment_stock_dbxref_id", generator: "assigned"
		version false
	}
}
