package D.Interface.F.InterfaceSegregationPrinciple;

public class Main {
    public static void main(String[] args) {
        var calculator = new TaxCalculator2018(100_000);
        var report = new TaxReport();
        report.show(calculator); // pass the calculator to the method
        report.show(new TaxCalculator2019()); // can change calculator anywhere in the code,

    }
}

