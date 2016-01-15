package org.gmod.chado

class BlastOrganisms {

	String blastOrgName

	static mapping = {
		id column: "blast_org_id", generator: "assigned"
		version false
	}

	static constraints = {
		blastOrgName nullable: true, maxSize: 1025, unique: true
	}
}
