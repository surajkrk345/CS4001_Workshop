import java.util.Scanner;

public class NepalTaxCalculatorSingle {
    public static void main(String[] args) {
          
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Nepal Income Tax Calculator ---");
        System.out.print("Enter Annual Income (NPR): ");
        
        double income = sc.nextDouble();
        double taxPayable = 0.0;
        double taxableAmount = income; 
        
        System.out.println("\n--- Calculating Tax ---");
        if (taxableAmount > 5000000.0) {
            double tax = (taxableAmount - 5000000.0) * 0.39;
            taxPayable += tax;
            System.out.println("Tax on >50 Lakhs (39%): " + "NPR " + tax);
            taxableAmount = 5000000.0;
        }
        
        if (taxableAmount > 2000000.0) {
            double tax = (taxableAmount - 2000000.0) * 0.36;
            taxPayable += tax;
            System.out.println("Tax on >20 Lakhs (36%): " + "NPR " + tax);
            taxableAmount = 2000000.0;
        }
        
        if (taxableAmount > 1000000.0) {
            double tax = (taxableAmount - 1000000.0) * 0.30;
            taxPayable += tax;
            System.out.println("Tax on >10 Lakhs (30%): " + "NPR " + tax);
            taxableAmount = 1000000.0;
        }
        
        if (taxableAmount > 700000.0) {
            double tax = (taxableAmount - 700000.0) * 0.20;
            taxPayable += tax;
            System.out.println("Tax on >7 Lakhs (20%): " + "NPR " + tax);
            taxableAmount = 700000.0;
        }

        if (taxableAmount > 500000.0) {
            double tax = (taxableAmount - 500000.0) * 0.10;
            taxPayable += tax;
            System.out.println("Tax on >5 Lakhs (10%): " + "NPR " + tax);
            taxableAmount = 500000.0;
        }
        
        if (taxableAmount > 0.0) {
            double tax = taxableAmount * 0.01;
            taxPayable += tax;
            System.out.println("Tax on First 5 Lakhs (1%): " + "NPR " + tax);
        }
        System.out.println("\n-------------------------------------------");
        System.out.println("Total Tax Payable: NPR " + taxPayable);
        System.out.println("-------------------------------------------");
        sc.close();
    }
}

