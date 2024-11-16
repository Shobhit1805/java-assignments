//Write a Java program to calculate the sum of natural numbers up to a certain range 
import java.util.*;
public class SumOfnaturalNums{
    public static int sum(int x){
            int sumo = 0;
        for(int i = 1;i<=x;i++){
            sumo = sumo + i;
        }
            return sumo;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(sum(a));
    }
}
