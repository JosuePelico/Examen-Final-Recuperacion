package com.beesion.ms.test.service;

import com.beesion.ms.test.model.TreeNode;
import java.util.*;

public class BinaryTreePathSumService {
    public List<List<Integer>> encontrarRutas(TreeNode root, int targetSum) {
        List<List<Integer>> resultado = new ArrayList<>();
        dfs(root, targetSum, new ArrayList<>(), resultado);
        return resultado;
    }

    private void dfs(TreeNode nodo, int suma, List<Integer> camino, List<List<Integer>> resultado) {
        if (nodo == null) return;
        camino.add(nodo.val);
        suma -= nodo.val;
        if (nodo.left == null && nodo.right == null && suma == 0) {
            resultado.add(new ArrayList<>(camino));
        } else {
            dfs(nodo.left, suma, camino, resultado);
            dfs(nodo.right, suma, camino, resultado);
        }
        camino.remove(camino.size() - 1);
    }
}
