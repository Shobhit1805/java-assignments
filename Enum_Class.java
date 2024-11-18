enum StudentProfile{
    shobhit,SixtyFive,IETDAVV;
}

public class Enum_Class {
    public static void main(String args[]){
        StudentProfile[] sp = StudentProfile.values();
        for(StudentProfile s1 : sp){
            System.out.println(s1);
        }
    }
}