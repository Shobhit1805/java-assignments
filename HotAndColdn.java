// Create two user-defined exceptions named “TooHot” and “TooCold” to check the
// temperature (in Celsius) given by the user passed through the command line is too hot or
// too cold.
// If temperature > 35, throw exception “TooHot”.
// If temperature <5, throw exception “TooCold”.
// Otherwise, print “Normal” and convert it to Farenheit.
import java.util.*;
class TooHot extends Exception{
    public TooHot(String message){
        super(message);
    }
}

class TooCold extends Exception{
    public TooCold(String message){
        super(message);
    }
}

public class HotAndColdn{
    public static void checkTemp(double temp) throws TooCold , TooHot {
        if(temp > 35){
            throw new TooHot("too hot ");
        }else if(temp < 5){
            throw new TooCold("too cold ");
        }else{
            double f = 1.8 * temp + 32;
            System.out.println(f);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        try{
            checkTemp(x);
        }
        
        catch(TooHot t){
            System.out.println(t.getMessage());
        }
        catch(TooCold t){
            System.out.println(t.getMessage());
        }
    }
}