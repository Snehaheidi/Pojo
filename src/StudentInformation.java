import java.util.ArrayList;

public class StudentInformation
{
    public static void main(String[] args) {
        StudentDetail student = new StudentDetail();
        StudentDetail student1 = new StudentDetail("sneha",1001,16);
        StudentDetail student2 = new StudentDetail("Thenmozhi",1002,16);
        StudentDetail student3 = new StudentDetail("chitra",1003,16);
        StudentDetail student4 = new StudentDetail("varnika",1004,16);
        ArrayList<StudentDetail> s = new ArrayList<>();
        s.add(0,student1);
        s.add(1,student2);
        s.add(2,student3);
        s.add(3,student4);
        for(StudentDetail i:s)
        {
            System.out.println("Name : "+i.getSname()+"\t\t Reg.No : "+i.getSId()+"\t\tAge: "+i.getSage());
        }
    }
}
