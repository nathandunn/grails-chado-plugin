package org.gmod.chado

class Project {

	String name
	String description

	static hasMany = [
//			assayProjects: AssayProject,
	                  ndExperimentProjects: NdExperimentProject,
	                  projectContacts: ProjectContact,
	                  projectPubs: ProjectPub,
	                  projectRelationshipsForObjectProjectId: ProjectRelationship,
	                  projectRelationshipsForSubjectProjectId: ProjectRelationship,
	                  projectprops: Projectprop]

	// TODO you have multiple hasMany references for class(es) [ProjectRelationship] 
	//      so you'll need to disambiguate them with the 'mappedBy' property:
	static mappedBy = [projectRelationshipsForObjectProjectId: "projectByObjectProjectId",
	                   projectRelationshipsForSubjectProjectId: "projectBySubjectProjectId"]

	static mapping = {
		id column: "project_id", generator: "assigned"
		version false
	}

	static constraints = {
		name unique: true
	}
}
