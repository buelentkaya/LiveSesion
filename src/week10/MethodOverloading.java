package week10;

public class MethodOverloading {
    public static void main(String[] args) {

        // methods with same parameters and same names but different data types



    }

    public static double convert(double feet, double inches) {
        // 1 feet= 12 inches

        if(feet<0||inches<0||inches>12){
            System.err.println("Invalid feet or inches");
            return -1.0;
        }
     return  feet*12*2.54+ inches*2.54;


    }

}
