package customArrayList;

import java.util.Arrays;

public class MyArrayList<T> {
    private Object[] elements;
    private int initialCapacity = 10;
    private float initialLoadFactor = 0.75F;
    private int size = 0;


    public MyArrayList() {
        elements = new Object[initialCapacity];
        System.out.println("The new arraylist has been created. Initial capacity is "
                            + this.getInitialCapacity());
    }

    public MyArrayList(int initialCapacity) {
        this.initialCapacity = initialCapacity;
        elements = new Object[initialCapacity];
        System.out.println("The new arraylist has been created. Initial capacity is "
                + this.getInitialCapacity());
    }

    public MyArrayList(int initialCapacity, float initialLoadFactor) {
        this.initialCapacity = initialCapacity;
        this.initialLoadFactor = initialLoadFactor;
        elements = new Object[initialCapacity];
        System.out.println("The new arraylist has been created. Initial capacity is "
                + this.getInitialCapacity());
    }


    public int getSize() {
        return size;
    }

    public int getInitialCapacity() {
        return initialCapacity;
    }

    public float getInitialLoadFactor() {
        return initialLoadFactor;
    }


    public void put(T element){
        elements[this.getSize()] = element;
        System.out.println("The element has been put with index [" + this.getSize() + "]");
        size++;
        if(this.getSize() == Math.round(this.getInitialCapacity()*this.getInitialLoadFactor())) {
            autoResize();
        }
    }

    public T get(int index) {
        if(index > elements.length - 1) {
            System.out.println("No element with such index");
            return null;
        }
        return (T) this.elements[index];
    }

    public void delete(int index) {
        if(index > elements.length - 1) {
            System.out.println("No element with such index");
            return;
        }

        if(elements[index] == null) {
            System.out.println("Object at the " + index + " doesn't exist");
            return;
        }

        this.elements[index] = null;
        for(int i = index+1; i < this.getSize(); i++) {
            elements[i-1] = elements[i];
        }
                size--;
        System.out.println("The Object at " + index + " has been deleted.");
    }

    public void autoResize() {
        int currentCapacity = this.initialCapacity * 2;
        elements = Arrays.copyOf(elements, currentCapacity);
        this.initialCapacity = currentCapacity;
        System.out.println("The arrayList has been resized");
    }

}
