import java.util.Scanner;
public class SumOfOdds{
    public static int sumOdd(int arr[]){
        int count = 0;
        int size = arr.length;
        for(int i =0;i<size;i++){
            if(arr[i]%2 != 0){
                count = count + arr[i];
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sumOdd(arr));
    }
}