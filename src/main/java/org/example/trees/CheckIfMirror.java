package org.example.trees;

import java.util.LinkedList;
import java.util.Queue;


public class CheckIfMirror {
    public static boolean isSymmetric(TreeNode root) {
        // Write your code here.
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null) {
            return true; // A null tree is considered symmetric
        }
        q.add(root);
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode m = q.poll();
            TreeNode n = q.poll();

            if (m == null && n == null) {
                continue;
            }
            if (m == null || n == null || m.val != n.val) {
                return false; // Trees are not symmetric
            }

            q.add(m.left);
            q.add(n.right);
            q.add(m.right);
            q.add(n.left);
        }
        return true; // Tree is symmetric
    }

    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        System.out.println(isSymmetric(root) ? "YES" : "NO"); // Should print YES
    }
}
