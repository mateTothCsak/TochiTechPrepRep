package algorithms.stack;

public class Main {

    public static void main(String[] args) throws Exception {
        Stack stack = new Stack(8);
        //stack.pop();
        stack.push(2);
        stack.push(3);
        stack.push(5);
        stack.push(1);
        System.out.println(stack.peek());
        stack.push(8);
        stack.push(8);
        stack.push(8);
        stack.push(9);
        stack.pop();
        stack.push(3);
        System.out.println(stack.toString());
        System.out.println(stack.peek());
    }
}
