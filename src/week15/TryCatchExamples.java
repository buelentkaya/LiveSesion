package week15;

public class TryCatchExamples {
    public static void main(String[] args) {

try{
    System.out.println(10/2);
    System.out.println(10/0);
    System.out.println(10/5);
}catch(ArithmeticException e){
    System.out.println(e.getMessage());
}

    }
}
