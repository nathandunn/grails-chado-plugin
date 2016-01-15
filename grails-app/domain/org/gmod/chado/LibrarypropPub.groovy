package org.gmod.chado

class LibrarypropPub {

	Pub pub
	Libraryprop libraryprop

	static belongsTo = [Libraryprop, Pub]

	static mapping = {
		id column: "libraryprop_pub_id", generator: "assigned"
		version false
	}
}
