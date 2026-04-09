package org.acme

import jakarta.transaction.Transactional
import jakarta.ws.rs.Consumes
import jakarta.ws.rs.GET
import jakarta.ws.rs.POST
import jakarta.ws.rs.PUT
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class GreetingResource(
 private val repo: GreetingRepository
) {

    @POST
    @Transactional
    fun hello(): GreetingEntity {
        val greetingEntity = GreetingEntity(field = "value")
        repo.persist(greetingEntity)
        return greetingEntity
    }

    @GET()
    @Path("/{id}")
    fun hello2(id: Long): GreetingDto {
        return repo.find("id", id)
            .project(GreetingDto::class.java)
            .firstResult()
    }

    @PUT
    @Path("/{id}")
    fun hello3(id: Long): GreetingEntity {
        return repo.findById(id)
    }

}