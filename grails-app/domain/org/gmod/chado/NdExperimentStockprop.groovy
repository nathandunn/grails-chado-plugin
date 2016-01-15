package org.gmod.chado

class NdExperimentStockprop {

	String value
	Integer rank
	NdExperimentStock ndExperimentStock
	Cvterm cvterm

	static belongsTo = [Cvterm, NdExperimentStock]

	static mapping = {
		id column: "nd_experiment_stockprop_id", generator: "assigned"
		version false
	}

	static constraints = {
		value nullable: true
		rank unique: ["type_id", "nd_experiment_stock_id"]
	}
}
