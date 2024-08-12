class ABC{
     private 
    String s1 ;
    
void setvalue(String name){
    s1 = name ;
}
String getvalue(){
    return s1;
}
}

public class getset{
public static void main(String[] args) {
    ABC o1 = new ABC();
    o1.setvalue("JAVA");
    System.out.println(o1.getvalue());

   
    
}
}
