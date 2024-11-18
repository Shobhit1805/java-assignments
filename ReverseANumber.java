import java.util.*;
public class ReverseANumber{
    public static int reverse(int num){
        int rev_num = 0; 
        while (num > 0) { 
        rev_num = rev_num * 10 + num % 10; 
        num = num / 10; 
    } 
    return rev_num;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(reverse(a));
    }
}