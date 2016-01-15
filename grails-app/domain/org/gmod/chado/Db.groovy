package org.gmod.chado

class Db {

	String name
	String description
	String urlprefix
	String url

	static hasMany = [dbxrefs: Dbxref]

	static mapping = {
		id column: "db_id", generator: "assigned"
		version false
	}

	static constraints = {
		name unique: true
		description nullable: true
		urlprefix nullable: true
		url nullable: true
	}
}
