package com.beesion.ms.test.resource;

import com.beesion.ms.test.dto.LibroDTO;
import com.beesion.ms.test.model.Libro;
import com.beesion.ms.test.service.LibroService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/libros")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LibroResource {

    @Inject
    LibroService libroService;

    @POST
    public Libro crear(LibroDTO dto) {
        return libroService.crear(dto);
    }

    @GET
    public List<Libro> obtenerTodos() {
        return libroService.obtenerTodos();
    }

    @GET
    @Path("/{id}")
    public Libro obtenerPorId(@PathParam("id") Long id) {
        return libroService.obtenerPorId(id);
    }

    @PUT
    @Path("/{id}")
    public Libro actualizar(@PathParam("id") Long id, LibroDTO dto) {
        return libroService.actualizar(id, dto);
    }

    @DELETE
    @Path("/{id}")
    public void eliminar(@PathParam("id") Long id) {
        libroService.eliminar(id);
    }
}
