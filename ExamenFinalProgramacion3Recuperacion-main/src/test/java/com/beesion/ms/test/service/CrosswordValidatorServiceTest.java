package com.beesion.ms.test.service;

import org.junit.jupiter.api.Test;
import java.util.Set;
import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CrosswordValidatorServiceTest {

    @Test
    public void testTableroValido() {
        CrosswordValidatorService service = new CrosswordValidatorService();
        char[][] board = {
            {'H','E','L','L','O','#','W','O','R','D'},
            {'#','#','#','#','#','#','#','#','#','#'},
            {'J','A','V','A','#','#','#','#','#','#'},
            {'#','#','#','#','#','#','#','#','#','#'},
            {'C','O','D','E','#','C','A','T','#','#'},
            {'#','#','#','#','#','#','#','#','#','#'},
            {'#','#','P','Y','T','H','O','N','#','#'},
            {'#','#','#','#','#','#','#','#','#','#'},
            {'#','#','#','#','#','#','#','#','#','#'},
            {'#','#','#','#','#','#','#','#','#','#'}
        };

        Set<String> diccionario = new HashSet<>();
        diccionario.add("HELLO");
        diccionario.add("WORLD");
        diccionario.add("JAVA");
        diccionario.add("CODE");
        diccionario.add("CAT");
        diccionario.add("PYTHON");

        assertTrue(service.validarTablero(board, diccionario));
    }

    @Test
    public void testTableroInvalido() {
        CrosswordValidatorService service = new CrosswordValidatorService();
        char[][] board = {
            {'H','E','L','L','O','#','W','O','R','D'},
            {'#','#','#','#','#','#','#','#','#','#'},
            {'B','A','D','#','#','#','#','#','#','#'},  // Palabra inválida: "BAD"
            {'#','#','#','#','#','#','#','#','#','#'},
            {'C','O','D','E','#','C','A','T','#','#'},
            {'#','#','#','#','#','#','#','#','#','#'},
            {'#','#','P','Y','T','H','O','N','#','#'},
            {'#','#','#','#','#','#','#','#','#','#'},
            {'#','#','#','#','#','#','#','#','#','#'},
            {'#','#','#','#','#','#','#','#','#','#'}
        };

        Set<String> diccionario = new HashSet<>();
        diccionario.add("HELLO");
        diccionario.add("WORLD");
        diccionario.add("JAVA");
        diccionario.add("CODE");
        diccionario.add("CAT");
        diccionario.add("PYTHON");	

       
        assertFalse(service.validarTablero(board, diccionario)); 
    }
}
