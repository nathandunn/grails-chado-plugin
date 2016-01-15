package org.gmod.chado

class StudyAssay {

	Study study
	Assay assay

	static belongsTo = [Assay, Study]

	static mapping = {
		id column: "study_assay_id", generator: "assigned"
		version false
	}
}
