package week12;

public class Microsoft {
    public static void main(String[] args) {
        Employee[] testers={
                new Employee("Yasin","Sdet",123,150000),
                new Employee("Erol","QA Lead",101,170000),
                new Employee("Rumeysa","QA Engineer",232,120000),
                new Employee("Dilek","SDET",134,155000)
        };
        double maxSalary=Double.MIN_VALUE;
       for(Employee each:testers){
           //each is a reference for our objects created inside the array!
           System.out.println(each.toString());
        if(each.salary>maxSalary)
            maxSalary= each.salary;
       }
        System.out.println(maxSalary);
        System.out.println(testers[0].name);//Yasin








    }
}
