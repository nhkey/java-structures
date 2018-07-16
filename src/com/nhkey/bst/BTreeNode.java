package com.nhkey.bst;

import java.util.Objects;

public class BTreeNode {
    private int val;
    public BTreeNode left;
    public BTreeNode right;

    public int getVal() {
        return this.val;
    }

    public BTreeNode(int value) {
        this.val = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BTreeNode bTreeNode = (BTreeNode) o;
        return val == bTreeNode.val &&
                Objects.equals(left, bTreeNode.left) &&
                Objects.equals(right, bTreeNode.right);
    }

    @Override
    public int hashCode() {

        return Objects.hash(val, left, right);
    }
}
