
class ABC{
    
    ABC(){
        System.out.println("hello");
    }
    ABC(String s){
        System.out.println(s);
    }
    ABC(int k , int j){
        System.out.println(k * j);
    }
}

public class DifferentConstructors{
    public static void main(String args[]){
        ABC s1 = new ABC();
        ABC s2 = new ABC("Shobhit");
        ABC s3 = new ABC(3, 5);
    }
}
