import java.util.*;
public class BreakAndContinueStatement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =2;i<=n;i++){
            if(i%2 != 0){
                continue;
            }
            System.out.println(i);
        }
    }
}