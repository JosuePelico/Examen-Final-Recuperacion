/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beesion.ms.test.service.impl;

/**
 *
 * @author rodol
 */
import com.beesion.ms.mapper.AddressMapper;
import com.beesion.ms.model.Address;
import com.beesion.ms.model.Person;
import com.beesion.ms.test.dto.AddressDto;
import com.beesion.ms.test.repository.AddressRepository;
import com.beesion.ms.test.repository.PersonRepository;
import com.beesion.ms.test.service.IAddressService;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class AddressService implements IAddressService {

    @Inject
    AddressRepository addressRepository;
    
    @Inject
    PersonRepository personRepository;
    
    @Inject
    AddressMapper addressMapper;

    @Override
    public List<AddressDto> findByPersonId(Long personId) {
        return addressRepository.findByPersonId(personId)
                .stream()
                .map(addressMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public AddressDto create(AddressDto addressDto) {
        Person person = personRepository.findById(addressDto.personId);
        Address address = addressMapper.toEntity(addressDto);
        address.person = person;
        addressRepository.persist(address);
        return addressMapper.toDto(address);
    }

    @Override
    public List<AddressDto> findAll() {
        return addressRepository.listAll()
                .stream()
                .map(addressMapper::toDto)
                .collect(Collectors.toList());
    }
}