
interface One{
    void oneA();
    void oneB();
}

interface Two{
    void twoA();
    void twoB();
}

interface Three{
    void threeA();
    void threeB();
}

interface New extends One, Two, Three{
    void newMethod();
}

class concrete{
    public void concreteFunc(){
        System.out.println("concrete class method called");
    }
}

class Waboo extends concrete implements New{

    public void oneA(){
        System.out.println("oneA from interface One");
    }

    public void oneB(){
        System.out.println("oneB from interface One");
    }

    public void twoA(){
        System.out.println("twoA from interface Two");
    }

    public void twoB(){
        System.out.println("twoB from interface Two");
    }

    public void threeA(){
        System.out.println("threeA from interface Three");
    }

    public void threeB(){
        System.out.println("threeB from interface Three");
    }

    public void newMethod(){
        System.out.println("new method from interface new");
    }
}


public class Interfaces{
    public static void main(String args[]){
        Waboo w1 = new Waboo();
        w1.oneA();
        w1.oneB();
        w1.twoA();
        w1.twoB();
        w1.threeA();
        w1.threeB();
        w1.newMethod();
    }
}