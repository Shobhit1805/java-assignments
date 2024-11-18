import java.util.*;
public class ConsecutiveDigitsSum{
    public static int sumTwo(String s){
        if(s.length() < 2){
            return 0;
        }
        int num = Integer.parseInt(s.substring(0,2));
        return num + sumTwo(s.substring(1,s.length()));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    String a = sc.next();
    System.out.println(sumTwo(a));
    }
}