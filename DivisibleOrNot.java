import java.util.*;
public class DivisibleOrNot{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to be checked :");
        int a = sc.nextInt();
    System.out.println("Enter number we have to divide the first number with :");
        int b = sc.nextInt();
        if(a%b == 0){
            System.out.println("Given number is divisible. ");
        }else{
            System.out.println("Given number is not divisible. ");
        }
        sc.close();
    }
}
