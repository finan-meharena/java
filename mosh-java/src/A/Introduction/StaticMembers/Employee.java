package A.Introduction.StaticMembers;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployees;  // static field

    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    public static void printNumberOfEmployees(){  // static method
        System.out.println(numberOfEmployees);
    }
    public Employee(int baseSalary){
        this(baseSalary, 0);
    }
    // Or

//    public Employee(int baseSalary){
//        setBaseSalary(baseSalary);
//        setHourlyRate(0);
//    }
    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }

    public int calculateWage(){  // if no extra hours
        return baseSalary + hourlyRate;
    }
    // Or
//    public int calculateWage(){
//        return calculateWage(0);
//    }

    public void setBaseSalary(int baseSalary){
        if (baseSalary < 0)
            throw new IllegalArgumentException("Salary can't be zero or less");
        this.baseSalary = baseSalary;
    }

    public void setHourlyRate(int hourlyRate){
        if(hourlyRate < 0)
            throw new IllegalArgumentException("Hourly rate can't be zero or less");
        this.hourlyRate = hourlyRate;
    }

    private int getBaseSalary(){
        return baseSalary;
    }

    private int getHourlyRate(){
        return hourlyRate;
    }

}
