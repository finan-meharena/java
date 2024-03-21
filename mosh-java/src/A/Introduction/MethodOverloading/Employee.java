package A.Introduction.MethodOverloading;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }
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
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary can't be zero or less");
        this.baseSalary = baseSalary;
    }

    public void setHourlyRate(int hourlyRate){
        if(hourlyRate <= 0)
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
