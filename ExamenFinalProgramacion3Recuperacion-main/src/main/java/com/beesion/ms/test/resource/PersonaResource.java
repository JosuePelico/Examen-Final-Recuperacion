package com.beesion.ms.test.resource;

import com.beesion.ms.model.Person;
import com.beesion.ms.test.dto.PersonDto;
import com.beesion.ms.test.service.impl.PersonService;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/persons")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonaResource {

    @Inject
    PersonService personService;

    @GET
    public Response getAllPersons() {
        List<PersonDto> persons = personService.findAll();
        return Response.ok(persons).build();
    }

    @GET
    @Path("/{id}")
    public Response getPersonById(@PathParam("id") Long id) {
        PersonDto person = personService.findById(id);
        return Response.ok(person).build();
    }

    @POST
    public Response createPerson(PersonDto personDto) {
        PersonDto createdPerson = personService.create(personDto);
        return Response.status(Response.Status.CREATED).entity(createdPerson).build();
    }

    @PUT
    @Path("/{id}")
    public Response updatePerson(@PathParam("id") Long id, PersonDto personDto) {
        PersonDto updatedPerson = personService.update(id, personDto);
        return Response.ok(updatedPerson).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deletePerson(@PathParam("id") Long id) {
        personService.delete(id);
        return Response.noContent().build();
    }

    @GET
    @Path("/{id}/addresses")
    public Response getPersonAddresses(@PathParam("id") Long personId) {
        return personService.getPersonAddresses(personId);
    }
    
}
