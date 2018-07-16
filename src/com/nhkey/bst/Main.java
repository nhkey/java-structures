package com.nhkey.bst;

public class Main {

    public static void main(String[] args) {
        BST bst = new BST();
        bst.addKey(40);
        bst.addKey(50);
        bst.addKey(10);
        bst.addKey(20);
        bst.addKey(55);
        bst.addKey(60);
        bst.addKey(90);
        bst.addKey(15);
        System.out.println(bst.orderByLine());
    }
}
