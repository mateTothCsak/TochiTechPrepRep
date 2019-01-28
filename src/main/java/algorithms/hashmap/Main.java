package algorithms.hashmap;

public class Main {

    public static void main(String[] args) throws Exception {
        MyHashMap hashm = new MyHashMap();
        hashm.add("Key1", 1);
        hashm.add("Key2", 2);
        System.out.println(hashm.getValueOf("Key1"));
        System.out.println(hashm.getElements().length);
    }

}
