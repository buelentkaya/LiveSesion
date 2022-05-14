package week15.CustomExceptions;

public class CustomExceptionTest {
    public static void main(String[] args) {

        int minutes=60;
        System.out.println("Class is going on  for   "+ minutes+ " minutes");

        if(minutes>50){
            throw new BreakTimeException("It is break time");
        }
        System.out.println("Let us continue the class another "+ (50- minutes)+ " minutes");

        double balance=395.50;
        double itemPrice=500;
        System.out.println("I have "+ balance+ ">Euros in my account the item is "+ itemPrice);

        if(itemPrice>balance){
            throw new InsufficientBalanceException("transaction declined doe to insufficient balance hold");
        }


    }
}
