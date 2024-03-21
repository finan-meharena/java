package A.Introduction.StaticMembers;

public class Main {
    public static void main(String[] args) {
        var employee = new Employee(50_000); // since we dont have hourlyRate,
                                                        // its gonna use the constructor with 1 param
        var anotherEmployee = new Employee(50_000, 300);

        System.out.println(Employee.numberOfEmployees); // access that field without creating an object
        Employee.printNumberOfEmployees(); // static method


    }

}
