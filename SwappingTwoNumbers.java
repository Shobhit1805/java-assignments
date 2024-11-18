import java.util.*;
public class SwappingTwoNumbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before : a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After : a = " + a + ", b = " + b);
    }
}