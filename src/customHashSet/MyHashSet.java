package customHashSet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MyHashSet<T> {
    private HashMap<Object, Object> map;
    private static final Object DEFAULT_VALUE = null;
    private int initialCapacity = 16;

    public MyHashSet() {
        map = new HashMap<>(initialCapacity);
        System.out.println("A new HashSet has been created");
    }
    public MyHashSet(int initialCapacity) {
        this.initialCapacity = initialCapacity;
        map = new HashMap<>(initialCapacity);
        System.out.println("A new HashSet with initial capacity " + this.getInitialCapacity() + " has been created");
    }

    public void put(T element) {
        if(this.contains(element)) {
            System.out.println("The HashSet already contains object " + element.toString());
            return;
        }
        map.put(element, DEFAULT_VALUE);
        System.out.println("The element " + element.toString() + " has been put in");

        if(this.getSize() == this.initialCapacity) {
            autoResize();
        }

    }
    public boolean contains(T element) {
        return map.containsKey(element);
    }

    public void delete(T element) {
        if(!this.contains(element)) {
            System.out.println("The hashSet doesn't contain element" + element.toString());
            return;
        }
        map.remove(element);
        System.out.println("The element " + element.toString() + " has been removed");
    }

    public Iterator<Object> iterator() {
        return map.keySet().iterator();
    }
    public void autoResize() {
        HashMap<Object, Object> resizedMap = new HashMap<>(this.getSize() * 2);
        resizedMap.putAll(map);
        map = resizedMap;
        System.out.println("The hashSet has been resized");

    }

    public int getSize(){
        return map.size();
    }
    public int getInitialCapacity() {
        return initialCapacity;
    }
    // keep uniqueness;

}
