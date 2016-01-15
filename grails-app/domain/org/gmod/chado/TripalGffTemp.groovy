package org.gmod.chado

import org.apache.commons.lang.builder.EqualsBuilder
import org.apache.commons.lang.builder.HashCodeBuilder

class TripalGffTemp implements Serializable {

	Integer featureId
	Integer organismId
	String uniquename
	String typeName

	int hashCode() {
		def builder = new HashCodeBuilder()
		builder.append featureId
		builder.append organismId
		builder.append uniquename
		builder.append typeName
		builder.toHashCode()
	}

	boolean equals(other) {
		if (other == null) return false
		def builder = new EqualsBuilder()
		builder.append featureId, other.featureId
		builder.append organismId, other.organismId
		builder.append uniquename, other.uniquename
		builder.append typeName, other.typeName
		builder.isEquals()
	}

	static mapping = {
		id composite: ["featureId", "organismId", "uniquename", "typeName"]
		version false
	}

	static constraints = {
		featureId unique: true
		typeName maxSize: 1024, unique: ["organism_id", "uniquename"]
	}
}
