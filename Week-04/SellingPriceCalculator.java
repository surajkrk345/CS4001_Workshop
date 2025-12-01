import java.util.Scanner;

public class SellingPriceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double markedPrice;
        String category;
        double discountRate = 0.0;
        double discountAmount;
        double sellingPrice;

        System.out.println("Enter the marked price of the item:");
        markedPrice = sc.nextDouble();
        sc.nextLine(); 

        System.out.println("Enter the category of the item:");
        category = sc.nextLine();
        
        switch (category) {
            case "A":
                discountRate = 0.60;
                break;
            case "B":
                discountRate = 0.40;
                break;
            case "C":
                discountRate = 0.20;
                break;
            case "D":
                discountRate = 0.10;
                break;
            default:
                
                System.out.println("Invalid category entered. Discount cannot be calculated.");
                sc.close();
                return;
        }
        discountAmount = markedPrice * discountRate;
        sellingPrice = markedPrice - discountAmount;

        System.out.println("\n--- Calculation Summary ---");
        System.out.println("Marked Price: NPR " + markedPrice);
        System.out.println("Category: " + category + " (" + (discountRate * 100) + "% Discount)");
        System.out.println("Discount Amount: NPR " + discountAmount);
        System.out.println("Final Selling Price: NPR " + sellingPrice);
        System.out.println("---------------------------");

        sc.close();
    }
}