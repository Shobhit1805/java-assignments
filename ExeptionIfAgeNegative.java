import java.util.*;
class invalidException extends Exception{
    invalidException(String msg){
        System.out.println(msg);
    }
}

public class ExeptionIfAgeNegative{
    public static void func(String s , int age) throws invalidException{
        if(age < 0){
            throw new invalidException("negative age");
        }else{
            System.out.println(s);
            System.out.println(age);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        try{
            func(name , age);
        }
        catch(Exception x){
            System.out.println(x);
        }
    }
}