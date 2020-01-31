import interfaces.StudentInfoProvider;
import model.*;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Jackson", 3.4);

        CustomDisplayModifer displayModifer = new CustomDisplayModifer();
        CustomStudentInfoProvider studentInfoProvider = new CustomStudentInfoProvider(student);
        StudentInfoDisplay theDisplay = new StudentInfoDisplay(displayModifer,studentInfoProvider);
        theDisplay.display();

        AnotherDisplayModifier anotherDisplayModifier = new AnotherDisplayModifier();
        StudentInfoDisplay anotherDis = new StudentInfoDisplay(anotherDisplayModifier,studentInfoProvider);
        anotherDis.display();
    }
}
