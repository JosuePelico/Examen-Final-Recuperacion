package com.beesion.ms.test.service.impl;

import com.beesion.ms.mapper.PersonMapper;
import com.beesion.ms.model.Person;
import com.beesion.ms.test.dto.PersonDto;
import com.beesion.ms.test.repository.PersonRepository;
import com.beesion.ms.test.service.IPersonService;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class PersonService implements IPersonService{

        @Inject
    PersonRepository personRepository;
    
    @Inject
    PersonMapper personMapper;

    @Override
    public List<PersonDto> findAll() {
        return personRepository.listAll()
                .stream()
                .map(personMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public PersonDto findById(Long id) {
        Person person = personRepository.findById(id);
        return personMapper.toDto(person);
    }

    @Override
    @Transactional
    public PersonDto create(PersonDto personDto) {
        Person person = personMapper.toEntity(personDto);
        personRepository.persist(person);
        return personMapper.toDto(person);
    }

    @Override
    @Transactional
    public PersonDto update(Long id, PersonDto personDto) {
        Person person = personRepository.findById(id);
        personMapper.updateEntityFromDto(personDto, person);
        personRepository.persist(person);
        return personMapper.toDto(person);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        personRepository.deleteById(id);
    }

    @Override
    public Response getPersonAddresses(Long personId) {
        // Implementación en la siguiente sección
        return null;
    }

    @Override
    public void save(Person per) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
