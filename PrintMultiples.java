import java.util.*;
public class PrintMultiples{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 10;i<a;i+=10){
            System.out.println(i);
        }
    }
}