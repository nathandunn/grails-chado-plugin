package org.gmod.chado

class Magedocumentation {

	Integer rowId
	String mageidentifier
	Tableinfo tableinfo
	Mageml mageml

	static belongsTo = [Mageml, Tableinfo]

	static mapping = {
		id column: "magedocumentation_id", generator: "assigned"
		version false
	}
}
