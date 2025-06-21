package com.beesion.ms.test.repository;

import com.beesion.ms.test.model.Libro;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LibroRepository implements PanacheRepository<Libro> {}
