package com.beesion.ms.test.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author rodol
 */
@Data
public class PersonDto {
    private Long id;
    private String name;


    // Constructor con campos
    public PersonDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters y Setters (DEBEN ser públicos)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}