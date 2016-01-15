package org.gmod.chado

import org.apache.commons.lang.builder.EqualsBuilder
import org.apache.commons.lang.builder.HashCodeBuilder

class FpKey implements Serializable {

	Integer featureId
	String pkey
	String value

	int hashCode() {
		def builder = new HashCodeBuilder()
		builder.append featureId
		builder.append pkey
		builder.append value
		builder.toHashCode()
	}

	boolean equals(other) {
		if (other == null) return false
		def builder = new EqualsBuilder()
		builder.append featureId, other.featureId
		builder.append pkey, other.pkey
		builder.append value, other.value
		builder.isEquals()
	}

	static mapping = {
		id composite: ["featureId", "pkey", "value"]
		version false
	}

	static constraints = {
		featureId nullable: true
		pkey nullable: true, maxSize: 1024
		value nullable: true
	}
}
