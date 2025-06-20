/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beesion.ms.test.resource;

/**
 *
 * @author rodol
 */


import com.beesion.ms.test.dto.AddressDto;
import com.beesion.ms.test.service.IAddressService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/addresses")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AddressResource {

    @Inject
    IAddressService addressService;

    @GET
    public Response getAllAddresses() {
        List<AddressDto> addresses = addressService.findAll();
        return Response.ok(addresses).build();
    }

    @POST
    public Response createAddress(AddressDto addressDto) {
        AddressDto createdAddress = addressService.create(addressDto);
        return Response.status(Response.Status.CREATED).entity(createdAddress).build();
    }
}