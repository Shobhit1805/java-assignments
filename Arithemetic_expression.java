
public class Arithemetic_expression{
    public static void main(String args[]){
        try{
            int y = 19/0;
            int arr[] = new int[-19];
            
        }catch(NegativeArraySizeException e){
            System.out.println(e);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}