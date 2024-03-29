package D.Interface.B.CreatingInterface;

public class TaxReport {
    private TaxCalculator2018 calculator; // TaxReport class is tightly dependent on TaxCalculator class

    public TaxReport(TaxCalculator2018 calculator) {
        calculator = new TaxCalculator2018(100_000);
    }

    public void show(){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
