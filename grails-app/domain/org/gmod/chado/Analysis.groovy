package org.gmod.chado

class Analysis {

	String name
	String description
	String program
	String programversion
	String algorithm
	String sourcename
	String sourceversion
	String sourceuri
	Date timeexecuted

	static hasMany = [analysisOrganisms: AnalysisOrganism,
	                  analysisfeatures: Analysisfeature,
	                  analysisprops: Analysisprop,
	                  phylotrees: Phylotree
//					  ,
//	                  quantifications: Quantification
	]

	static mapping = {
		id column: "analysis_id", generator: "assigned"
		version false
	}

	static constraints = {
		name nullable: true
		description nullable: true
		algorithm nullable: true
		sourcename nullable: true, unique: ["programversion", "program"]
		sourceversion nullable: true
		sourceuri nullable: true
	}
}
