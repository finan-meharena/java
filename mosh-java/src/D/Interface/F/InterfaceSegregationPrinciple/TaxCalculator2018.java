package D.Interface.F.InterfaceSegregationPrinciple;

public class TaxCalculator2018 implements TaxCalculator {
    private double taxableIncome;

    public TaxCalculator2018(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override // tell java compiler that we are overriding a method in the interface
    public double calculateTax(){
        return  taxableIncome * 0.4;
    }
}
