package org.gmod.chado

class ExpressionImage {

	Expression expression
	Eimage eimage

	static belongsTo = [Eimage, Expression]

	static mapping = {
		id column: "expression_image_id", generator: "assigned"
		version false
	}
}
