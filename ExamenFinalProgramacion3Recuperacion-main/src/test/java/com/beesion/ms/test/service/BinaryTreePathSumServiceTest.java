package com.beesion.ms.test.service;

import com.beesion.ms.test.model.TreeNode;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreePathSumServiceTest {

    @Test
    public void testEncontrarRutas() {
        BinaryTreePathSumService service = new BinaryTreePathSumService();

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);

        List<List<Integer>> result = service.encontrarRutas(root, 22);

        List<Integer> ruta1 = Arrays.asList(5, 4, 11, 2);
        List<Integer> ruta2 = Arrays.asList(5, 8, 4, 5);

        assertEquals(2, result.size());
        assertTrue(result.contains(ruta1));
        assertTrue(result.contains(ruta2));
    }
}

