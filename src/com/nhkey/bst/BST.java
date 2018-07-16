package com.nhkey.bst;

import org.jetbrains.annotations.Contract;

public class BST {
    private BTreeNode root;

    public BST() {
        this.root = null;
    }

    public BTreeNode search(int val) {
        return searchRec(this.root, val);
    }

    @Contract("null, _ -> null")
    private BTreeNode searchRec(BTreeNode startNode, int val) {
        if (startNode == null || startNode.getVal() == val) {
            return startNode;
        }
        return searchRec(
                val > startNode.getVal() ? startNode.right : startNode.left,
                val
        );
    }

    public void addKey(int val) {
        this.root = addKeyRec(root, val);
    }

    public BTreeNode addKeyRec(BTreeNode node, int val)
    {
        if (node == null) {
            return new BTreeNode(val);
        }

        if (node.getVal() < val) {
            node.right = addKeyRec(node.right, val);
        } else if (node.getVal() > val) {
            node.left = addKeyRec(node.left, val);
        }

        return node;
    }

    // This method mainly calls InorderRec()
    public String inorder()  {
        return inorderRec(this.root);
    }

    // A utility function to do inorder traversal of BST
    private String inorderRec(BTreeNode node) {
        String result = "";
        if (node != null) {
            result += inorderRec(node.left);
            result += node.getVal() + " ";
            result += inorderRec(node.right);
        }
        return result;
    }

    public String preorder() {
        return preorderRec(root);
    }

    private String preorderRec(BTreeNode node)
    {
        String s = "";
        if (node != null) {
            s += node.getVal() + " ";
            s += preorderRec(node.left);
            s += preorderRec(node.right);
        }
        return s;
    }

    public String postorder() {
        return postorderRec(root);
    }

    private String postorderRec(BTreeNode node)
    {
        String s = "";
        if (node != null) {
            s += postorderRec(node.left);
            s += postorderRec(node.right);
            s += node.getVal() + " ";
        }
        return s;
    }

    public String orderByLine() {
        int h = this.getHeight();
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= h; i++) {
            str.append(orderByLineRec(this.root, i));
        }
        return str.toString();
    }

    private String orderByLineRec(BTreeNode node, int height) {
        if (node == null) {
            return "";
        }
        if (height == 1) {
            return node.getVal() + " ";
        }
        return orderByLineRec(node.left, height - 1) + orderByLineRec(node.right, height - 1);
    }

    public int getHeight() {
        return getHeightRec(this.root);
    }

    private int getHeightRec(BTreeNode node) {
        if (node == null) {
            return 0;
        }
        int heightLeft =  getHeightRec(node.left);
        int heightRight =  getHeightRec(node.right);
        return Math.max(heightLeft, heightRight) + 1;
    }

    public void deleteValue(int val) {
        BTreeNode node = this.search(val);
        if (node == null) {
            return;
        }

        if (node.left == null) {
            
        }
    }
}
