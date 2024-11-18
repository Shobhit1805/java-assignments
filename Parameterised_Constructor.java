class ABC{
    ABC(int x){
        System.out.println(x * 9);
    }
}
public class Parameterised_Constructor{
    public static void main(String args[]){
        ABC s1 = new ABC(5);
    }
}