public class StaticKeyword {
    
}
class Student{
    static String College;
}

class Main{
    public static void main(String args[]){
        Student.College = "abc";
        Student s1 = new Student();
        System.out.println(s1.College);
    }
}