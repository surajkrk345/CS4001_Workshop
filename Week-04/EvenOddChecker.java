 import java.util.Scanner;

 class EvenOddChecker{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an integer to check if it is odd or even");
        
        int number = sc.nextInt();
        
        System.out.println("----------------------------------------");

                if (number % 2 == 0) {
            System.out.println("The number " + number + " is an EVEN number.");
        } else {
            System.out.println("The number " + number + " is an ODD number.");
        }
        
        System.out.println("----------------------------------------");
        
        sc.close();
    }
}