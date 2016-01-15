package org.gmod.chado

class Feature {

	String name
	String uniquename
	String residues
	Integer seqlen
	String md5checksum
	Boolean isAnalysis
	Boolean isObsolete
	Date timeaccessioned
	Date timelastmodified
	Serializable searchableName
	Dbxref dbxref
	Organism organism
	Cvterm cvterm

	static hasMany = [analysisfeatures: Analysisfeature,
//	                  cellLineFeatures: CellLineFeature,
//	                  elements: Element,
	                  featureCvterms: FeatureCvterm,
	                  featureDbxrefs: FeatureDbxref,
	                  featureExpressions: FeatureExpression,
	                  featureGenotypesForChromosomeId: FeatureGenotype,
	                  featureGenotypesForFeatureId: FeatureGenotype,
	                  featurePhenotypes: FeaturePhenotype,
	                  featurePubs: FeaturePub,
	                  featureRelationshipsForObjectId: FeatureRelationship,
	                  featureRelationshipsForSubjectId: FeatureRelationship,
	                  featureSynonyms: FeatureSynonym,
	                  featurelocsForFeatureId: Featureloc,
	                  featurelocsForSrcfeatureId: Featureloc,
	                  featureposesForFeatureId: Featurepos,
	                  featureposesForMapFeatureId: Featurepos,
	                  featureprops: Featureprop,
	                  featurerangesForFeatureId: Featurerange,
	                  featurerangesForLeftendfId: Featurerange,
	                  featurerangesForLeftstartfId: Featurerange,
	                  featurerangesForRightendfId: Featurerange,
	                  featurerangesForRightstartfId: Featurerange,
	                  libraryFeatures: LibraryFeature,
	                  phylonodes: Phylonode
//	                  studypropFeatures: StudypropFeature
	]
	static belongsTo = [Cvterm, Dbxref, Organism]

	// TODO you have multiple hasMany references for class(es) [FeatureGenotype, FeatureRelationship, Featureloc, Featurepos, Featurerange] 
	//      so you'll need to disambiguate them with the 'mappedBy' property:
	static mappedBy = [featureGenotypesForChromosomeId: "TODO",
	                   featureGenotypesForFeatureId: "TODO",
	                   featureRelationshipsForObjectId: "TODO",
	                   featureRelationshipsForSubjectId: "TODO",
	                   featurelocsForFeatureId: "TODO",
	                   featurelocsForSrcfeatureId: "TODO",
	                   featureposesForFeatureId: "TODO",
	                   featureposesForMapFeatureId: "TODO",
	                   featurerangesForFeatureId: "TODO",
	                   featurerangesForLeftendfId: "TODO",
	                   featurerangesForLeftstartfId: "TODO",
	                   featurerangesForRightendfId: "TODO",
	                   featurerangesForRightstartfId: "TODO"]

	static mapping = {
		id column: "feature_id", generator: "assigned"
		version false
	}

	static constraints = {
		name nullable: true
		residues nullable: true
		seqlen nullable: true
		md5checksum nullable: true, maxSize: 32
		searchableName nullable: true
	}
}
