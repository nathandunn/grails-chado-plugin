package org.gmod.chado

class Arraydesign {

	String name
	String description
	String arrayDimensions
	String elementDimensions
	Integer numOfElements
	Integer numArrayColumns
	Integer numArrayRows
	Integer numGridColumns
	Integer numGridRows
	Integer numSubColumns
	Integer numSubRows
	Cvterm cvtermByPlatformtypeId
	Contact contact
	Dbxref dbxref
	Protocol protocol
	Cvterm cvtermBySubstratetypeId

	static hasMany = [arraydesignprops: Arraydesignprop,
	                  assays: Assay,
	                  elements: Element]
	static belongsTo = [Contact, Cvterm, Dbxref, Protocol]

	static mapping = {
		id column: "arraydesign_id", generator: "assigned"
	}

	static constraints = {
		name unique: true
		description nullable: true
		arrayDimensions nullable: true
		elementDimensions nullable: true
		numOfElements nullable: true
		numArrayColumns nullable: true
		numArrayRows nullable: true
		numGridColumns nullable: true
		numGridRows nullable: true
		numSubColumns nullable: true
		numSubRows nullable: true
	}
}
