package com.beesion.ms.test.service;

import com.beesion.ms.test.model.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeDepthServiceTest {

    @Test
    public void testProfundidades() {
        BinaryTreeDepthService service = new BinaryTreeDepthService();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right = new TreeNode(4);

        int min = service.profundidadMinima(root);  // debería ser 2 (por el lado derecho)
        int max = service.profundidadMaxima(root);  // debería ser 3 (por el lado izquierdo)

        assertEquals(2, min);
        assertEquals(3, max);
    }
}
