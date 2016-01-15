package org.gmod.chado

class Pubauthor {

	Integer rank
	Boolean editor
	String surname
	String givennames
	String suffix
	Pub pub

	static belongsTo = [Pub]

	static mapping = {
		id column: "pubauthor_id", generator: "assigned"
		version false
	}

	static constraints = {
		rank unique: ["pub_id"]
		editor nullable: true
		surname maxSize: 100
		givennames nullable: true, maxSize: 100
		suffix nullable: true, maxSize: 100
	}
}
