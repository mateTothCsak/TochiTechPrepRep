package algorithms.binarysearchtree;

import java.util.List;

public class BaeldungBinarySearchTree {

    private Node root;


    public void add(Integer toAdd) {
        root = addRecursive(root, toAdd);
    }

    public boolean search(Integer toFind) {
        return searchRecursive(root,toFind);
    }

    public void remove(Integer toRemove) {
        root = deleteRecursive(root, toRemove);
    }

    private int findSmallestValue(Node root){
        return root.leftChild == null ? root.value : findSmallestValue(root.leftChild);
    }


    public static BaeldungBinarySearchTree build(List<Integer> elements) {
        BaeldungBinarySearchTree binarySearchTree = new BaeldungBinarySearchTree();

        for (int i=0; i<elements.size(); i++){
            binarySearchTree.add(elements.get(i));
        }

        return binarySearchTree;
    }




    private Node addRecursive(Node current, int value){
        if (current == null){
            return new Node(value);
        }

        if (value < current.value){
            current.leftChild = addRecursive(current.leftChild, value);
        } else if (value > current.value){
            current.rightChild = addRecursive(current.rightChild, value);
        } else {
            return current;
        }

        return current;
    }


    public boolean searchRecursive(Node current, int value){
        if (current == null){
            return false;
        }
        if (value == current.value){
            return true;
        }
        return value < current.value
                ? searchRecursive(current.leftChild, value)
                : searchRecursive(current.rightChild, value);
    }


    public Node deleteRecursive(Node current, int value){
        if (current == null){
            return null;
        }

        if (value == current.value){
            if (current.leftChild == null && current.rightChild == null){
                return null;
            }
            if (current.rightChild == null){
                return current.leftChild;
            }
            if (current.leftChild == null){
                return current.rightChild;
            }

            int smallestValue = findSmallestValue(current.rightChild);
            current.value = smallestValue;
            current.rightChild = deleteRecursive(current.rightChild, smallestValue);
            return current;
        }

        if (value < current.value){
            current.leftChild = deleteRecursive(current.leftChild, value);
            return current;
        }

        current.rightChild = deleteRecursive(current.rightChild, value);
        return current;

    }


}
