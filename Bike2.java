//this is single inheritance code 

class vehicle{
    void run(){
        System.out.println("vehicle is running");
    }
}

class Bike2 extends vehicle {
    @Override
    void run(){
        System.out.println("Bike is running");
    }
    public static void main(String[] args) {
        Bike2 obj = new Bike2();
        obj.run();
    }
}


