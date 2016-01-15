package org.gmod.chado

import org.apache.commons.lang.builder.EqualsBuilder
import org.apache.commons.lang.builder.HashCodeBuilder

class KeggByOrganism implements Serializable {

	String analysisName
	Integer analysisId
	Integer organismId

	int hashCode() {
		def builder = new HashCodeBuilder()
		builder.append analysisName
		builder.append analysisId
		builder.append organismId
		builder.toHashCode()
	}

	boolean equals(other) {
		if (other == null) return false
		def builder = new EqualsBuilder()
		builder.append analysisName, other.analysisName
		builder.append analysisId, other.analysisId
		builder.append organismId, other.organismId
		builder.isEquals()
	}

	static mapping = {
		id composite: ["analysisName", "analysisId", "organismId"]
		version false
	}

	static constraints = {
		analysisName nullable: true
		analysisId nullable: true
		organismId nullable: true
	}
}
