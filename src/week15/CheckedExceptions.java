package week15;

public class CheckedExceptions {
    public static void main(String[] args) throws InterruptedException {


        //1.try and catch
        try{
            Thread.sleep(3000);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("I will move on with my web Automation");

//2. throws
        Thread.sleep(3000);
        System.out.println("More automation after 3 more seconds");
    }
}
