package D.Interface.D.SetterInjection;

public class TaxReport {

    private TaxCalculator calculator; // use Interface instead of the TaxCalculator2018 class

    public TaxReport(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    public void show(){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

    public void setCalculator(TaxCalculator calculator) { // setter injection
        this.calculator = calculator;
    }
}
