package com.beesion.ms.test.service;

import com.beesion.ms.test.model.TreeNode;

public class BinaryTreeDepthService {
    public int profundidadMinima(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null) return 1 + profundidadMinima(root.right);
        if (root.right == null) return 1 + profundidadMinima(root.left);
        return 1 + Math.min(profundidadMinima(root.left), profundidadMinima(root.right));
    }

    public int profundidadMaxima(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(profundidadMaxima(root.left), profundidadMaxima(root.right));
    }
}
