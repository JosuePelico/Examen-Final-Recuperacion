package com.beesion.ms.test.service;

import java.util.*;

public class CrosswordValidatorService {

    public boolean validarTablero(char[][] board, Set<String> diccionario) {
        int n = board.length;
        for (int i = 0; i < n; i++) {
            if (!validarLinea(new String(board[i]), diccionario)) return false;

            StringBuilder columna = new StringBuilder();
            for (int j = 0; j < n; j++) {
                columna.append(board[j][i]);
            }

            if (!validarLinea(columna.toString(), diccionario)) return false;
        }
        return true;
    }

    private boolean validarLinea(String linea, Set<String> diccionario) {
        for (String palabra : linea.split("#+")) {
            if (palabra.length() >= 2 && !diccionario.contains(palabra)) {
                return false;
            }
        }
        return true;
    }
}

