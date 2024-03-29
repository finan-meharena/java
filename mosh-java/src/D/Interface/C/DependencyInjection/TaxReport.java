package D.Interface.C.DependencyInjection;

public class TaxReport {
    private TaxCalculator calculator; // use Interface instead of the TaxCalculator2018 class

    public TaxReport(TaxCalculator calculator) { // constructor injection
        this.calculator = calculator;
    }

    public void show(){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
