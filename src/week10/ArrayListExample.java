package week10;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //to show autoboxing
        ArrayList<Integer>arr=new ArrayList<>();

        for (int i = 0; i <10 ; i++) {
            arr.add(i); // primitive to Object  Autoboxing"
        }
    }
}
