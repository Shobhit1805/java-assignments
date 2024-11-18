import java.util.*;
public class DegreeConversion{
    public static double fahrenheitToCelsius(double x){
        return 0.556 * (x - 32);
    }
    public static double celsiusToFahrenheit(double x){
        return 1.8 * x + 32;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        double x = sc.nextDouble();
        System.out.println("Enter 1 for celsius to fahrenheit and 2 for fahrenheit to celsius :");
        int input = sc.nextInt();
        switch(input){
            case 1 -> System.out.println(x + " celsius in fahrenheit would be "+ celsiusToFahrenheit(x));
            case 2 -> System.out.println(x + " fahrenheit in celsius would be "+ fahrenheitToCelsius(x));
            default -> System.out.println("Invalid input");
        }
    }
}