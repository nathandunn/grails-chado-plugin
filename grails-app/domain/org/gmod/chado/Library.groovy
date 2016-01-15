package org.gmod.chado

class Library {

	String name
	String uniquename
	Integer isObsolete
	Date timeaccessioned
	Date timelastmodified
	Organism organism
	Cvterm cvterm

	static hasMany = [
//			cellLineLibraries: CellLineLibrary,
	                  libraryCvterms: LibraryCvterm,
	                  libraryDbxrefs: LibraryDbxref,
	                  libraryFeatures: LibraryFeature,
	                  libraryPubs: LibraryPub,
	                  librarySynonyms: LibrarySynonym,
	                  libraryprops: Libraryprop]
	static belongsTo = [Cvterm, Organism]

	static mapping = {
		id column: "library_id", generator: "assigned"
		version false
	}

	static constraints = {
		name nullable: true
	}
}
