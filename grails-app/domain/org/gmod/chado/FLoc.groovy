package org.gmod.chado

import org.apache.commons.lang.builder.EqualsBuilder
import org.apache.commons.lang.builder.HashCodeBuilder

class FLoc implements Serializable {

	Integer featureId
	String name
	Integer dbxrefId
	Integer nbeg
	Integer nend
	Short strand

	int hashCode() {
		def builder = new HashCodeBuilder()
		builder.append featureId
		builder.append name
		builder.append dbxrefId
		builder.append nbeg
		builder.append nend
		builder.append strand
		builder.toHashCode()
	}

	boolean equals(other) {
		if (other == null) return false
		def builder = new EqualsBuilder()
		builder.append featureId, other.featureId
		builder.append name, other.name
		builder.append dbxrefId, other.dbxrefId
		builder.append nbeg, other.nbeg
		builder.append nend, other.nend
		builder.append strand, other.strand
		builder.isEquals()
	}

	static mapping = {
		id composite: ["featureId", "name", "dbxrefId", "nbeg", "nend", "strand"]
		version false
	}

	static constraints = {
		featureId nullable: true
		name nullable: true
		dbxrefId nullable: true
		nbeg nullable: true
		nend nullable: true
		strand nullable: true
	}
}
