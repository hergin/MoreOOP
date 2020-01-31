import interfaces.AnotherDisplayModifier;
import interfaces.CustomDisplayModifier;
import interfaces.CustomStudentInfoProvider;
import model.Student;

public class Main {

    public static void main(String[] args) {

        Student myself = new Student("Joel",4.0);

        CustomDisplayModifier displaym = new CustomDisplayModifier();
        CustomStudentInfoProvider studentinfom = new CustomStudentInfoProvider(myself);
        StudentInfoDisplay studentinfo = new StudentInfoDisplay(displaym,studentinfom);

        studentinfo.display();

        AnotherDisplayModifier displaym2 = new AnotherDisplayModifier();
        CustomStudentInfoProvider studentinfom2 = new CustomStudentInfoProvider(myself);
        StudentInfoDisplay studentinfo2 = new StudentInfoDisplay(displaym2,studentinfom2);

        studentinfo2.display();


    }
}
