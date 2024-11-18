public class ArithematicException{
    public static void main(String args[]){
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        
        
        try{
            int arr[] = new int[-9];
        }
        catch(NegativeArraySizeException x){
            System.out.println(x);
        }
    }
}