package org.gmod.chado

import org.apache.commons.lang.builder.EqualsBuilder
import org.apache.commons.lang.builder.HashCodeBuilder

class FnrType implements Serializable {

	Integer featureId
	String name
	Integer dbxrefId
	String type
	String residues
	Integer seqlen
	String md5checksum
	Integer typeId
	Date timeaccessioned
	Date timelastmodified

	int hashCode() {
		def builder = new HashCodeBuilder()
		builder.append featureId
		builder.append name
		builder.append dbxrefId
		builder.append type
		builder.append residues
		builder.append seqlen
		builder.append md5checksum
		builder.append typeId
		builder.append timeaccessioned
		builder.append timelastmodified
		builder.toHashCode()
	}

	boolean equals(other) {
		if (other == null) return false
		def builder = new EqualsBuilder()
		builder.append featureId, other.featureId
		builder.append name, other.name
		builder.append dbxrefId, other.dbxrefId
		builder.append type, other.type
		builder.append residues, other.residues
		builder.append seqlen, other.seqlen
		builder.append md5checksum, other.md5checksum
		builder.append typeId, other.typeId
		builder.append timeaccessioned, other.timeaccessioned
		builder.append timelastmodified, other.timelastmodified
		builder.isEquals()
	}

	static mapping = {
		id composite: ["featureId", "name", "dbxrefId", "type", "residues", "seqlen", "md5checksum", "typeId", "timeaccessioned", "timelastmodified"]
		version false
	}

	static constraints = {
		featureId nullable: true
		name nullable: true
		dbxrefId nullable: true
		type nullable: true, maxSize: 1024
		residues nullable: true
		seqlen nullable: true
		md5checksum nullable: true, maxSize: 32
		typeId nullable: true
		timeaccessioned nullable: true
		timelastmodified nullable: true
	}
}
