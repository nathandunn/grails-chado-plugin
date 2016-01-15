package org.gmod.chado

import org.apache.commons.lang.builder.EqualsBuilder
import org.apache.commons.lang.builder.HashCodeBuilder

class BlastHitData implements Serializable {

	Integer analysisfeatureId
	Integer analysisId
	Integer featureId
	Integer dbId
	Integer hitNum
	String hitName
	String hitUrl
	String hitDescription
	String hitOrganism
	Integer blastOrgId
	String hitAccession
	Double hitBestEval
	Double hitBestScore
	Double hitPid

	int hashCode() {
		def builder = new HashCodeBuilder()
		builder.append analysisfeatureId
		builder.append analysisId
		builder.append featureId
		builder.append dbId
		builder.append hitNum
		builder.append hitName
		builder.append hitUrl
		builder.append hitDescription
		builder.append hitOrganism
		builder.append blastOrgId
		builder.append hitAccession
		builder.append hitBestEval
		builder.append hitBestScore
		builder.append hitPid
		builder.toHashCode()
	}

	boolean equals(other) {
		if (other == null) return false
		def builder = new EqualsBuilder()
		builder.append analysisfeatureId, other.analysisfeatureId
		builder.append analysisId, other.analysisId
		builder.append featureId, other.featureId
		builder.append dbId, other.dbId
		builder.append hitNum, other.hitNum
		builder.append hitName, other.hitName
		builder.append hitUrl, other.hitUrl
		builder.append hitDescription, other.hitDescription
		builder.append hitOrganism, other.hitOrganism
		builder.append blastOrgId, other.blastOrgId
		builder.append hitAccession, other.hitAccession
		builder.append hitBestEval, other.hitBestEval
		builder.append hitBestScore, other.hitBestScore
		builder.append hitPid, other.hitPid
		builder.isEquals()
	}

	static mapping = {
		id composite: ["analysisfeatureId", "analysisId", "featureId", "dbId", "hitNum", "hitName", "hitUrl", "hitDescription", "hitOrganism", "blastOrgId", "hitAccession", "hitBestEval", "hitBestScore", "hitPid"]
		version false
	}

	static constraints = {
		hitName nullable: true, maxSize: 1025
		hitUrl nullable: true
		hitDescription nullable: true
		hitOrganism nullable: true, maxSize: 1025
		blastOrgId nullable: true
		hitAccession nullable: true
		hitBestEval nullable: true, scale: 17
		hitBestScore nullable: true, scale: 17
		hitPid nullable: true, scale: 17
	}
}
