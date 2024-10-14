import java.util.Scanner;


    class Commission {
        public
        int sales ;
        int Commission;

        Commission(){
            this.Commission  = 0;
            
        }                                                                                               
        // int x = Commission;
        int commission(){
            //  int x = Commission;
            this.Commission= (10 * sales) / 100 ;
            return this.Commission;
        }   
    };

   public class demo {
        
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        Commission c1 = new Commission();
        c1.sales = sc.nextInt();
        // c1.Commission();        
        System.out.println(c1.commission());
        sc.close();
    }
   }
