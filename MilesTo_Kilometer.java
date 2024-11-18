import java.util.*;
public class MilesTo_Kilometer{
    public static double milesToKilometers(double x){
        return x * 1.6;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        System.out.println(x + " miles is " + milesToKilometers(x) + " kilometers. ");
        // sc.close();
    }
}