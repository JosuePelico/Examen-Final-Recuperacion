/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beesion.ms.test.service;

/**
 *
 * @author rodol
 */

import com.beesion.ms.test.dto.AddressDto;
import java.util.List;

public interface IAddressService {
    List<AddressDto> findByPersonId(Long personId);
    AddressDto create(AddressDto addressDto);
    List<AddressDto> findAll();
}