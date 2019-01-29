package algorithms.binarysearchtree;

import java.util.List;

public class BinarySearchTreeBuilder {

    private Node root;


    public void build(List<Integer> elements){
        int round = elements.size() % 2 == 0? 1 : 0;
        int middlePoint = elements.size()/2 + round;
        root  = new Node(elements.get(middlePoint));
        List<Integer> leftList = elements.subList(0, middlePoint);
        List<Integer> rightList = elements.subList(middlePoint+1, elements.size());
        buildRecursive(leftList, root);
        buildRecursive(rightList, root);
    }

    public void buildRecursive(List<Integer> elements, Node parent){
        int round = elements.size() % 2 == 0? 1 : 0;
        int middlePoint = elements.size()/2 + round;
        Node current = new Node(elements.get(middlePoint));
        if (current.value < parent.value){
            parent.leftChild = current;
        } else if (current.value > parent.value){
            parent.rightChild = current;
        }
        List<Integer> leftList = elements.subList(0, middlePoint);
        List<Integer> rightList = elements.subList(middlePoint+1, elements.size());
        if (leftList.size() > 0) {
            buildRecursive(leftList, current);
        }
        if (rightList.size() > 0) {
            buildRecursive(rightList, current);
        }
    }

}
