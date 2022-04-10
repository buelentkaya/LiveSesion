package week13;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("Mike","Smith",30);

        System.out.println(person);

        System.out.println(person.getFirstName()); //"undefined"
        System.out.println(person.getLastName()); //"undefined"
        System.out.println(person.getAge()); // -1
        System.out.println(person.toString()); //"undefined | undefined | -1"

        Person personOne = new Person("Mike","Smith",30);

        System.out.println(personOne);

        // can I change this person's name?
        //   personOne.firstName= "Oscar";     no access to the data to change it


/*
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setAge(44);

        System.out.println(person.toString() ); // "John | Doe | 44"

        Person person = new Person("Fatima", "Lee", 22);

        System.out.println(person.getFirstName()); //"Fatima"
        System.out.println(person.getLastName()); //"Lee"
        System.out.println(person.getAge()); // 22
        System.out.println(person.toString()); //"Fatima | Lee | 22"


        */

    }
}
