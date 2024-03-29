package D.Interface.A.TightlyCoupled;

public class TaxReport {
    private TaxCalculator calculator; // TaxReport class is tightly dependent on TaxCalculator class

    public TaxReport(TaxCalculator calculator) {
        calculator = new TaxCalculator(100_000);
    }

    public void show(){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
