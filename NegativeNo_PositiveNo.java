import java.util.*;
public class NegativeNo_PositiveNo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a > 0){
            System.out.println("entered number is positive. ");
        }
        else if(a < 0){
            System.out.println("entered number is negative. ");
        }
        else{
            System.out.println("entered number is zero. ");
        }
    }
}