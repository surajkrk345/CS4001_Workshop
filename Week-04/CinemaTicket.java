import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age group (child/adult/senior): ");
        String age = sc.nextLine().toLowerCase();
        
        System.out.print("Enter movie language (nepali/hindi/english): ");
        String lang = sc.nextLine().toLowerCase();
        
        System.out.print("Are you a student? (yes/no): ");
        String student = sc.nextLine().toLowerCase();
        
        System.out.print("Is it a festival day? (yes/no): ");
        String festival = sc.nextLine().toLowerCase();
        
        double price = 0;
        switch (age) {
            case "child":
                price = 150;
                break;
                
            case "adult":
                price = 250;
                break;
                
            case "senior":
                price = 200;
                break;
                
            default:
                System.out.println("Invalid age group!");
                return;
        }
                switch (lang) {
            case "nepali":
                break;
                
            case "hindi":
                price += 50;
                break;
                
            case "english":
                price += 100;
                break;
                
            default:
                System.out.println("Invalid language!");
                return;
        }
        if (student.equals("yes")) {
            price = price - (price * 0.20);
        }
        if (festival.equals("yes")) {
            price = price - (price * 0.15);
        }
        System.out.println("Final Ticket Price: Rs. " + price);
    }
}
