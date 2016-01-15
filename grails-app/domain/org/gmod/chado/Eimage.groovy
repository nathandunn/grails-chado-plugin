package org.gmod.chado

class Eimage {

	String eimageData
	String eimageType
	String imageUri

	static hasMany = [expressionImages: ExpressionImage]

	static mapping = {
		id column: "eimage_id", generator: "assigned"
		version false
	}

	static constraints = {
		eimageData nullable: true
		imageUri nullable: true
	}
}
