package D.Interface.E.MethodInjection;

public class TaxReport {

    private TaxCalculator calculator; // use Interface instead of the TaxCalculator2018 class

    public void show( TaxCalculator taxCalculator){ // method injections
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }


}
