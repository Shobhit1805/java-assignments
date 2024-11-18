
import java.util.*;
public class Grading_System{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter percentage: ");
        double x = sc.nextDouble();
        if(x >= 90 && x <=100){
            System.out.println("Grade A. ");
        }
        else if(x >= 80 && x <90){
            System.out.println("Grade B. ");
        }
        else if(x >= 70 && x <80){
            System.out.println("Grade C. ");
        }
        else if(x >= 60 && x <70){
            System.out.println("Grade D. ");
        }
        else if(x >= 40 && x <60){
            System.out.println("Grade E. ");
        }
        else if(x < 40){
            System.out.println("Grade F. ");
        }
        else{
            System.out.println("Invalid input. ");
        }
    }
}