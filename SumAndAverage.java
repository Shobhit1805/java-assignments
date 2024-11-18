import java.util.*;
public class SumAndAverage{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        double arr[] = new double[size];
        for(int i =0;i<size;i++){
            arr[i] = sc.nextDouble();
        }
        double count = 0;
        for(int i =0;i<size;i++){
            count = count + arr[i];
        }
        
        
        System.out.println("Sum is " + count);
        System.out.print("Average is " + count/size);
    }
}