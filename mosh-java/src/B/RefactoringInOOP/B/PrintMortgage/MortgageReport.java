package B.RefactoringInOOP.B.PrintMortgage;

import java.text.NumberFormat;

public class MortgageReport {

    private MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator; // add a calculator object property/field
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        printHeader("Mortgage");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public void printPaymentSchedule() {
        printHeader("PAYMENT SCHEDULE");
        for (double balance : calculator.getRemainingBalances()) {
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public void printHeader(String message){
        System.out.println();
        System.out.println(message);
        System.out.println("--------");
    }
}
