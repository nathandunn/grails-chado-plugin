package org.gmod.chado

class Environment {

	String uniquename
	String description

	static hasMany = [environmentCvterms: EnvironmentCvterm,
	                  phendescs: Phendesc,
	                  phenotypeComparisonsForEnvironment1Id: PhenotypeComparison,
	                  phenotypeComparisonsForEnvironment2Id: PhenotypeComparison,
	                  phenstatements: Phenstatement]

	// TODO you have multiple hasMany references for class(es) [PhenotypeComparison] 
	//      so you'll need to disambiguate them with the 'mappedBy' property:
	static mappedBy = [phenotypeComparisonsForEnvironment1Id: "TODO",
	                   phenotypeComparisonsForEnvironment2Id: "TODO"]

	static mapping = {
		id column: "environment_id", generator: "assigned"
		version false
	}

	static constraints = {
		uniquename unique: true
		description nullable: true
	}
}
