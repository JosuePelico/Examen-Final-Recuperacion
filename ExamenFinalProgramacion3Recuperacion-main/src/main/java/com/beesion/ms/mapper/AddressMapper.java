/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beesion.ms.mapper;

/**
 *
 * @author rodol
 */


import com.beesion.ms.model.Address;
import com.beesion.ms.test.dto.AddressDto;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AddressMapper {

    public AddressDto toDto(Address entity) {
        if (entity == null) {
            return null;
        }

        AddressDto dto = new AddressDto();
        dto.id = entity.id;
        dto.street = entity.street;
        dto.city = entity.city;
        dto.state = entity.state;
        dto.zipCode = entity.zipCode;
        
        if (entity.person != null) {
            dto.personId = entity.person.id;
        }
        
        return dto;
    }

    public Address toEntity(AddressDto dto) {
        if (dto == null) {
            return null;
        }

        Address entity = new Address();
        entity.id = dto.id;
        entity.street = dto.street;
        entity.city = dto.city;
        entity.state = dto.state;
        entity.zipCode = dto.zipCode;

        
        return entity;
    }

    public void updateEntityFromDto(AddressDto dto, Address entity) {
        if (dto == null || entity == null) {
            return;
        }

        entity.street = dto.street;
        entity.city = dto.city;
        entity.state = dto.state;
        entity.zipCode = dto.zipCode;
    
    }
}