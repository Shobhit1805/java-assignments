public class factorialnum {
    
    public static int factorial(int a ){
        if (a == 1) return 1;
        int ans = a * factorial(a-1);
    return ans ;}

    public static void main(String args[]){
            int a = 10;
            System.out.println("the factorial is :");
            System.out.println(factorial(a));
    }

}
