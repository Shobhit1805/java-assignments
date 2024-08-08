public class primeornot {
    
    public static boolean primeornotprime(int a ){
        for (int i=2; i <= a/2 ; i++){
            if (a % i == 0){
                return false;
            }
        }
    return true;}

    public static void main(String[] args) {
        int x = 37;
        System.out.println("the number is prime :");
        System.out.println(primeornotprime(x));
    }
}
