package org.gmod.chado

import org.apache.commons.lang.builder.EqualsBuilder
import org.apache.commons.lang.builder.HashCodeBuilder

class MaterializedView implements Serializable {

	Integer materializedViewId
	Date lastUpdate
	Integer refreshTime
	String name
	String mvSchema
	String mvTable
	String mvSpecs
	String indexed
	String query
	String specialIndex

	int hashCode() {
		def builder = new HashCodeBuilder()
		builder.append materializedViewId
		builder.append lastUpdate
		builder.append refreshTime
		builder.append name
		builder.append mvSchema
		builder.append mvTable
		builder.append mvSpecs
		builder.append indexed
		builder.append query
		builder.append specialIndex
		builder.toHashCode()
	}

	boolean equals(other) {
		if (other == null) return false
		def builder = new EqualsBuilder()
		builder.append materializedViewId, other.materializedViewId
		builder.append lastUpdate, other.lastUpdate
		builder.append refreshTime, other.refreshTime
		builder.append name, other.name
		builder.append mvSchema, other.mvSchema
		builder.append mvTable, other.mvTable
		builder.append mvSpecs, other.mvSpecs
		builder.append indexed, other.indexed
		builder.append query, other.query
		builder.append specialIndex, other.specialIndex
		builder.isEquals()
	}

	static mapping = {
		id composite: ["materializedViewId", "lastUpdate", "refreshTime", "name", "mvSchema", "mvTable", "mvSpecs", "indexed", "query", "specialIndex"]
		version false
	}

	static constraints = {
		lastUpdate nullable: true
		refreshTime nullable: true
		name nullable: true, maxSize: 64, unique: true
		mvSchema nullable: true, maxSize: 64
		mvTable nullable: true, maxSize: 128
		mvSpecs nullable: true
		indexed nullable: true
		query nullable: true
		specialIndex nullable: true
	}
}
