package A.Introduction.C.Constructor;

public class Main {
    public static void main(String[] args) {
        var employee = new Employee(50_000, 300); // provide the params, and they get validate by
        // the setters and getters we gave it

        int wage = employee.calculateWage(20);
        System.out.println(wage);

    }

}
