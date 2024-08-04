import customArrayList.MyArrayList;

public class CustomCollectionTrial {

    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.put(1);
        for(int i = 0; i < 12; i++) {
            myArrayList.put(i);
        }

        Integer i = myArrayList.get(5);
        System.out.println(i);
        Integer j = myArrayList.get(15);

        myArrayList.delete(5);
        myArrayList.delete(27);


    }
}
