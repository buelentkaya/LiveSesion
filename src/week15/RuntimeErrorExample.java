package week15;

import java.util.Scanner;

public class RuntimeErrorExample {
    public static void main(String[] args) {
int x=5;
int y= new Scanner(System.in).nextInt();

        System.out.println("Hello");
        try {
            System.out.println( x / y );  // when user puts zero this line will be skipped
        }catch(ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("How are you today?");
        System.out.println(">some more lines of code");
        System.out.println("we swallowed the exception object");



    }
}
