/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beesion.ms.mapper;

/**
 *
 * @author rodol
 */


import com.beesion.ms.model.Person;
import com.beesion.ms.test.dto.PersonDto;
import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class PersonMapper {
    
    public PersonDto toDto(Person entity) {
        if (entity == null) return null;
        
        PersonDto dto = new PersonDto(entity.id,entity.getName());
        dto.setId(entity.id);  // id es público en PanacheEntity
        dto.setName(entity.getName());  // Usando el getter
        return dto;
    }
    
    public Person toEntity(PersonDto dto) {
        if (dto == null) return null;
        
        Person entity = new Person();
        entity.id = dto.getId();  // id es público
        entity.setName(dto.getName());  // Usando el setter
        return entity;
    }
    
    public void updateEntityFromDto(PersonDto dto, Person entity) {
        if (dto == null || entity == null) return;
        entity.setName(dto.getName());  // Usando el setter
    }
}