package org.gmod.chado

class Mageml {

	String magePackage
	String mageMl

	static hasMany = [magedocumentations: Magedocumentation]

	static mapping = {
		id column: "mageml_id", generator: "assigned"
		version false
	}
}
