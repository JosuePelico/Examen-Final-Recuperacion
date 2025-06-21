package com.beesion.ms.test.service;

import com.beesion.ms.model.Person;
import com.beesion.ms.test.dto.PersonDto;
import jakarta.ws.rs.core.Response;
import java.util.List;

public interface IPersonService {
	
	public void save(Person per);

    List<PersonDto> findAll();
    PersonDto findById(Long id);
    PersonDto create(PersonDto personDto);
    PersonDto update(Long id, PersonDto personDto);
    void delete(Long id);
    Response getPersonAddresses(Long personId);


}
