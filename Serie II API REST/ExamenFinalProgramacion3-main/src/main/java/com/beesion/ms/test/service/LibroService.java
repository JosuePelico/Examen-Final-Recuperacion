package com.beesion.ms.test.service;

import com.beesion.ms.test.dto.LibroDTO;
import com.beesion.ms.test.model.Libro;

import java.util.List;

public interface LibroService {
    Libro crear(LibroDTO dto);
    List<Libro> obtenerTodos();
    Libro obtenerPorId(Long id);
    Libro actualizar(Long id, LibroDTO dto);
    void eliminar(Long id);
}
