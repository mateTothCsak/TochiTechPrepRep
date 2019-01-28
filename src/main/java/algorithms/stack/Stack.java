package algorithms.stack;

import java.util.Arrays;

public class Stack {

    private Integer[] stackArr;
    private int maxLength;
    int top;


    public Stack(int size) {
        this.maxLength = size-1;
        this.stackArr = new Integer[size];
    }

    public void push(int value) throws Exception {
        if (top <= maxLength) {
            stackArr[top] = value;
            top++;
        } else {
            throw new Exception("StackOverflow");
        }
    }

    public void pop() throws Exception {
        if (top == 0){
            throw new Exception("StackUnderflow");
        }
        top--;
        stackArr[top] = null;
    }

    public int peek() throws Exception {
        if (top == 0){
            throw new Exception("StackUnderflow");
        }
        return stackArr[top-1];
    }

    public int size(){
        int counter = 0;
        for (Integer item : stackArr){
            if(item != null){
                counter += 1;
            }
        }
        return counter;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "stackArr=" + Arrays.toString(stackArr) +
                '}';
    }

    //Tests could be written for this exercise
}
