package org.gmod.chado

class Libraryprop {

	String value
	Integer rank
	Library library
	Cvterm cvterm

	static hasMany = [librarypropPubs: LibrarypropPub]
	static belongsTo = [Cvterm, Library]

	static mapping = {
		id column: "libraryprop_id", generator: "assigned"
		version false
	}

	static constraints = {
		value nullable: true
		rank unique: ["type_id", "library_id"]
	}
}
