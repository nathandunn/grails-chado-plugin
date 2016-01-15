package org.gmod.chado

class TmpCdsHandlerRelationship {

	String parentId
	String grandparentId
	TmpCdsHandler tmpCdsHandler

	static belongsTo = [TmpCdsHandler]

	static mapping = {
		id column: "rel_row_id", generator: "assigned"
		version false
	}

	static constraints = {
		parentId nullable: true, maxSize: 1024
		grandparentId nullable: true, maxSize: 1024
	}
}
