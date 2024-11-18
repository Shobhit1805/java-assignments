class A{
    void showA(){
        System.out.println("from A");
    }
}

class B extends A{
    void showB(){
        System.out.println("from B");
    }
}

class C extends B{
    void showA(){
        System.out.println("from A newer");
    }
}

public class Multilevel_Inheritence{
    public static void main(String args[]){
        C obj = new C();
        obj.showA();
    }
}