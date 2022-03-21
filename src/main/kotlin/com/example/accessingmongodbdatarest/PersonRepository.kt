package com.example.accessingmongodbdatarest

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@Suppress("unused")
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
interface PersonRepository : MongoRepository<Person, String> {

    fun findByLastName(@Param("name") name: String): List<Person>

}