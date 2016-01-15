package org.gmod.chado

class CvtermDbxref {

	Integer isForDefinition
	Dbxref dbxref
	Cvterm cvterm

	static belongsTo = [Cvterm, Dbxref]

	static mapping = {
		id column: "cvterm_dbxref_id", generator: "assigned"
		version false
	}
}
