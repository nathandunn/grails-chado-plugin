package org.gmod.chado

class FeatureExpression {

	Pub pub
	Feature feature
	Expression expression

	static hasMany = [featureExpressionprops: FeatureExpressionprop]
	static belongsTo = [Expression, Feature, Pub]

	static mapping = {
		id column: "feature_expression_id", generator: "assigned"
		version false
	}
}
