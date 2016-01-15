package org.gmod.chado

import org.apache.commons.lang.builder.EqualsBuilder
import org.apache.commons.lang.builder.HashCodeBuilder

class TripalOboTemp implements Serializable {

	String id
	String stanza
	String type

	int hashCode() {
		def builder = new HashCodeBuilder()
		builder.append id
		builder.append stanza
		builder.append type
		builder.toHashCode()
	}

	boolean equals(other) {
		if (other == null) return false
		def builder = new EqualsBuilder()
		builder.append id, other.id
		builder.append stanza, other.stanza
		builder.append type, other.type
		builder.isEquals()
	}

	static mapping = {
		id composite: ["id", "stanza", "type"]
		version false
	}

	static constraints = {
		id unique: true
		type maxSize: 50
	}
}
