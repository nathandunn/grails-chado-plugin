package org.gmod.chado

class NdExperimentStock {

	Stock stock
	NdExperiment ndExperiment
	Cvterm cvterm

	static hasMany = [ndExperimentStockDbxrefs: NdExperimentStockDbxref,
	                  ndExperimentStockprops: NdExperimentStockprop]
	static belongsTo = [Cvterm, NdExperiment, Stock]

	static mapping = {
		id column: "nd_experiment_stock_id", generator: "assigned"
		version false
	}
}
