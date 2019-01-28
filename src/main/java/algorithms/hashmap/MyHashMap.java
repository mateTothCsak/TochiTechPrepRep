package algorithms.hashmap;

import java.util.LinkedList;

class MyHashMap<K, V> {

    private int bucketSize = 16;

    private LinkedList<KeyValue>[] elements = new LinkedList[bucketSize];

    public void add(K key, V value) {
        int position = getHash(key);
        if (elements[position] == null) {
            elements[position] = new LinkedList<KeyValue>();
        }
        elements[position].add(new KeyValue(key, value));
        // If the key already exists this function should throw an error.
        resizeIfNeeded();
    }

    public V getValueOf(K key) throws Exception {
        LinkedList<KeyValue> list = elements[getHash(key)];
        for (KeyValue kv : list) {
            if (kv.getKey().equals(key)) {
                return (V) kv.getValue();
            }
        }
        throw new Exception("Key not right sacket of HashMap");
    }

    private int getHash(K key) {
        return Math.abs(key.hashCode() % bucketSize);
    }

    private void resizeIfNeeded() {
        if (elements.length > bucketSize * 2) {
            bucketSize = bucketSize * 2;
        } else if (elements.length < bucketSize / 2) {
            bucketSize = bucketSize / 2;
        }
        LinkedList<KeyValue>[] tempElements = new LinkedList[bucketSize];
        copyElementsTo(tempElements);
        elements = tempElements;
        // items should be also reshuffled when resized
        //this does not exactly work with .length
    }

    public void copyElementsTo(LinkedList<KeyValue>[] tempList) {
        for (int i = 0; i < elements.length; i++) {
            tempList[i] = elements[i];
        }
    }

    public LinkedList<KeyValue>[] getElements() {
        return elements;
    }
}