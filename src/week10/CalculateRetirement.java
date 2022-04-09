package week10;

public class CalculateRetirement {
    public static void main(String[] args) {

      yearUntilRetirement("Bulent",1975);


    }

    public static int calculateAge(int yearOfBirth) {
        return 2022-yearOfBirth;
    }

    public static void yearUntilRetirement(String name,int yearOfBirth) {
int yearsUntilRetirement=65-calculateAge(yearOfBirth);

        System.out.println(name+" retires in " + yearsUntilRetirement+ " years.");

    }

}
