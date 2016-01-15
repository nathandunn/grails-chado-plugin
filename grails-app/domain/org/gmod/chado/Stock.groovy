package org.gmod.chado

class Stock {

	String name
	String uniquename
	String description
	Boolean isObsolete
	Dbxref dbxref
	Organism organism
	Cvterm cvterm

	static hasMany = [ndExperimentStocks: NdExperimentStock,
	                  stockCvterms: StockCvterm,
	                  stockDbxrefs: StockDbxref,
	                  stockGenotypes: StockGenotype,
	                  stockPubs: StockPub,
	                  stockRelationshipsForObjectId: StockRelationship,
	                  stockRelationshipsForSubjectId: StockRelationship,
	                  stockcollectionStocks: StockcollectionStock,
	                  stockprops: Stockprop]
	static belongsTo = [Cvterm, Dbxref, Organism]

	// TODO you have multiple hasMany references for class(es) [StockRelationship] 
	//      so you'll need to disambiguate them with the 'mappedBy' property:
	static mappedBy = [stockRelationshipsForObjectId: "stockByObjectId",
	                   stockRelationshipsForSubjectId: "stockBySubjectId"]

	static mapping = {
		id column: "stock_id", generator: "assigned"
		version false
	}

	static constraints = {
		name nullable: true
		description nullable: true
	}
}
