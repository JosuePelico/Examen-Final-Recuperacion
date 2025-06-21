package com.beesion.ms.test.service.impl;

import com.beesion.ms.test.dto.LibroDTO;
import com.beesion.ms.test.model.Libro;
import com.beesion.ms.test.repository.LibroRepository;
import com.beesion.ms.test.service.LibroService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class LibroServiceImpl implements LibroService {

    @Inject
    LibroRepository repo;

    @Override
    public Libro crear(LibroDTO dto) {
        Libro libro = map(dto);
        repo.persist(libro);
        return libro;
    }

    @Override
    public List<Libro> obtenerTodos() {
        return repo.listAll();
    }

    @Override
    public Libro obtenerPorId(Long id) {
        return repo.findById(id);
    }

    @Override
    public Libro actualizar(Long id, LibroDTO dto) {
        Libro libro = repo.findById(id);
        if (libro == null) return null;
        libro.titulo = dto.titulo;
        libro.autor = dto.autor;
        libro.anioPublicacion = dto.anioPublicacion;
        libro.genero = dto.genero;
        return libro;
    }

    @Override
    public void eliminar(Long id) {
        repo.deleteById(id);
    }

    private Libro map(LibroDTO dto) {
        Libro libro = new Libro();
        libro.titulo = dto.titulo;
        libro.autor = dto.autor;
        libro.anioPublicacion = dto.anioPublicacion;
        libro.genero = dto.genero;
        return libro;
    }
}
