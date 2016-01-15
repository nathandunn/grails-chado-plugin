package org.gmod.chado

class ExpressionPub {

	Pub pub
	Expression expression

	static belongsTo = [Expression, Pub]

	static mapping = {
		id column: "expression_pub_id", generator: "assigned"
		version false
	}
}
