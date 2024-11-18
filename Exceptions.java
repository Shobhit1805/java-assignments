
import java.util.*;

class TooOlder extends Exception{
    public TooOlder(String message){
        super(message);
    }
}
class TooYounger extends Exception{
    public TooYounger(String message){
        super(message);
    }
}

public class Exceptions{
    public static void check(int age) throws TooYounger , TooOlder{
            if(age > 45){
                throw new TooOlder("You are too old");
            }else if(age < 20){
                throw new TooYounger("You are too young");
            }else{
                System.out.println("You are eligible");
            }
    }
public static void Employee(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        try{
            check(x);
        }catch(TooYounger t){
            System.out.println(t.getMessage());
        }
        catch(TooOlder t){
            System.out.println(t.getMessage());
        }
    }
}