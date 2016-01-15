package org.gmod.chado

class Studyfactorvalue {

	String factorvalue
	String name
	Integer rank
	Studyfactor studyfactor
	Assay assay

	static belongsTo = [Assay, Studyfactor]

	static mapping = {
		id column: "studyfactorvalue_id", generator: "assigned"
		version false
	}

	static constraints = {
		factorvalue nullable: true
		name nullable: true
	}
}
