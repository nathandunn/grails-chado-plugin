package org.gmod.chado

class Tableinfo {

	String name
	String primaryKeyColumn
	Integer isView
	Integer viewOnTableId
	Integer superclassTableId
	Integer isUpdateable
	Date modificationDate

	static hasMany = [controls: Control,
	                  magedocumentations: Magedocumentation]

	static mapping = {
		id column: "tableinfo_id", generator: "assigned"
		version false
	}

	static constraints = {
		name maxSize: 30, unique: true
		primaryKeyColumn nullable: true, maxSize: 30
		viewOnTableId nullable: true
		superclassTableId nullable: true
	}
}
