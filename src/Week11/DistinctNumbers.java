package Week11;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class DistinctNumbers {
    public static void main(String[] args) {
        // it will get intput from user, and only will store distinct numbers to our arraylist#
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers (input ends with 0) :");
        int value;
        do {
            value = input.nextInt();

            if (!list.contains(value) && value != 0) {// if the list does not contain the value and not equel to zero add it.
                list.add(value);
            }

        } while (value != 0);// wenthe value equals to zero then stop do loop
        for (Integer numbers:list){
            System.out.print("numbers = " + numbers+" ");
        }

        System.out.println();
        System.out.println("the size of the array is "+ list.size()) ;
        Collections.sort(list);
        System.out.println(list);


       int max=Collections.max(list);
       int min=Collections.min(list);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        Collections.shuffle(list);
        System.out.println("list = " + list);








        }
}








