package A.Introduction.ConstructorOverloading;

public class Main {
    public static void main(String[] args) {
        var employee = new Employee(50_000); // since we dont have hourlyRate,
                                                        // its gonna use the constructor with 1 param
        var anotherEmployee = new Employee(50_000, 300);

        int wage = employee.calculateWage();
        int anotherWage = anotherEmployee.calculateWage();
        System.out.println(wage);
        System.out.println(anotherWage);


    }

}
