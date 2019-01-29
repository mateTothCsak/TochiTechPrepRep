package algorithms.binarysearchtree;

import java.io.IOException;
import java.util.ArrayList;

public class BinarySearchTreeExample {

    public static void main(String[] args) throws IOException {

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2 + 5);
        }

        BaeldungBinarySearchTree myTree = BaeldungBinarySearchTree.build(numbers);
        // write some test code here
        System.out.println(myTree.search(7)); // should be true
        System.out.println(myTree.search(55)); // should be true
        System.out.println(myTree.search(34535)); // should be false

        System.out.println("done");

        ArrayList<Integer> trial = new ArrayList<>();
        trial.add(1);
        trial.add(2);
        trial.add(3);
        trial.add(4);
        trial.add(5);
        trial.add(6);
        trial.add(7);


        BinarySearchTreeBuilder binarySearchTreeBuilder = new BinarySearchTreeBuilder();
        binarySearchTreeBuilder.build(trial);
    }

}
