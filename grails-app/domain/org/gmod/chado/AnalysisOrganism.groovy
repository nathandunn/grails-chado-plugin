package org.gmod.chado

import org.apache.commons.lang.builder.EqualsBuilder
import org.apache.commons.lang.builder.HashCodeBuilder

class AnalysisOrganism implements Serializable {

	Integer analysisId
	Integer organismId
	Organism organism
	Analysis analysis

	int hashCode() {
		def builder = new HashCodeBuilder()
		builder.append analysisId
		builder.append organismId
		builder.toHashCode()
	}

	boolean equals(other) {
		if (other == null) return false
		def builder = new EqualsBuilder()
		builder.append analysisId, other.analysisId
		builder.append organismId, other.organismId
		builder.isEquals()
	}

	static belongsTo = [Analysis, Organism]

	static mapping = {
		id composite: ["analysisId", "organismId"]
		version false
	}
}
