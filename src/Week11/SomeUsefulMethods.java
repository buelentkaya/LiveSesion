package Week11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class SomeUsefulMethods {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

list.remove(1);
        System.out.println(list);//[1, 3, 4, 5, 6, 7, 8, 9, 10]

list.remove(Integer.valueOf(1));
        System.out.println("list = " + list);//list = [3, 4, 5, 6, 7, 8, 9, 10]

        System.out.println("\"...............array to array list\" = " + "...............array to array list");
String [] array={"red","green","blue"};
ArrayList<String>list2=new ArrayList<>(Arrays.asList(array));
        System.out.println("list2 = " + list2);

        System.out.println("..................arraylist to array  ");

String[] arrayTwo=new String[list2.size()];

list2.toArray(arrayTwo);
        System.out.println(Arrays.toString(arrayTwo));




       int[] array3={1,2,3,4};
       ArrayList<Integer>listThree=new ArrayList<>();
       for(Integer each:array3){
           listThree.add(each);
       }
        System.out.println(listThree);






    }
}
