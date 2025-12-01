import java.util.Scanner;
public class ScholarshipChecker
{
    public static void main (String[]args){
Scanner sc = new Scanner(System.in);
        
         System.out.print("Enter GPA: ");
        double gpa = sc.nextDouble();

        System.out.print("Enter Attendance (%): ");
        double attendance = sc.nextDouble();

        System.out.print("Enter Attitude Score (1–10): ");
        int attitude = sc.nextInt();
        
        if (gpa>=3.6){
            if(attendance >=80){
                if(attitude >=5){
                  System.out.println("you are eligible for scholarship.");
                } else{
                    System.out.println("Attitude must greater than 5");
                }
            }else{
                    System.out.println("attendance must be greater than 80%");
                }
                }else{
                    System.out.println("Not eligible: Gpa must be at least 3.2.");
                }
            }
        }