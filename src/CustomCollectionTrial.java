import customArrayList.MyArrayList;
import customHashSet.MyHashSet;

import java.util.Iterator;

public class CustomCollectionTrial {

    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.put(1);
        for(int i = 0; i < 12; i++) {
            myArrayList.put(i);
        }

        Integer m = myArrayList.get(5);
        System.out.println(m);
        Integer n = myArrayList.get(15);
        System.out.println(n);

        myArrayList.delete(5);
        System.out.println(myArrayList.get(5));
        myArrayList.delete(27);

        MyHashSet<String> names = new MyHashSet<>();
        names.put("Nastya");
        names.put("Nastya");
        for(int i = 0; i < 20; i++) {
            names.put("Nastya" + i);
        }

        names.delete("Nastya5");
        System.out.println(names.contains("Nastya5"));
        Iterator<Object> iter = names.iterator();
        System.out.println(iter.hasNext());
        System.out.println(iter.next());
    }
}
