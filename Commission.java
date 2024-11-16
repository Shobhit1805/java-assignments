import java.util.*;

class commission{
    public int sales;

    commission(){
    }

    public int commission(int y){
        this.sales = y;
        return y/20;
    }
}

public class Commission{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Commission c1 = new Commission();
        int a = sc.nextInt();
        if(a > 0){
        System.out.println(c1.commission(a));
        }else{
            System.out.println("Invalid input. ");
        }
    }
}
