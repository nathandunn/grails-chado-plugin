package org.gmod.chado

class FeatureCvtermDbxref {

	Dbxref dbxref
	FeatureCvterm featureCvterm

	static belongsTo = [Dbxref, FeatureCvterm]

	static mapping = {
		id column: "feature_cvterm_dbxref_id", generator: "assigned"
		version false
	}
}
