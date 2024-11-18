import java.util.*;
public class DateOfBirth{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        if(month == 1){
            System.out.println("Birthday is " + day + " January, " + year);
        }
        if(month == 2){
            System.out.println("Birthday is " + day + " February, " + year);
        }
        if(month == 3){
            System.out.println("Birthday is " + day + " March, " + year);
        }
        if(month == 4){
            System.out.println("Birthday is " + day + " April, " + year);
        }
        if(month == 5){
            System.out.println("Birthday is " + day + " May, " + year);
        }
        if(month == 6){
            System.out.println("Birthday is " + day + " June, " + year);
        }
        if(month == 7){
            System.out.println("Birthday is " + day + " July, " + year);
        }
        if(month == 8){
            System.out.println("Birthday is " + day + " August, " + year);
        }
        if(month == 9){
            System.out.println("Birthday is " + day + " September, " + year);
        }
        if(month == 10){
            System.out.println("Birthday is " + day + " October, " + year);
        }
        if(month == 11){
            System.out.println("Birthday is " + day + " November, " + year);
        }
        if(month == 12){
            System.out.println("Birthday is " + day + " December, " + year);
        }
        sc.close();
    }
}