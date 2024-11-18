import java.util.*;
public class Count_Digits{
    public static int countDigits(int n){
        if(n == 0){
            return 1;
        }
        int count = 0;
        while(n != 0){
             n = n / 10;
             count++;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(countDigits(a));
    }
}