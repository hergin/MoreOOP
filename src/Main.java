import interfaces.StudentInfoProvider;
import model.Student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Boo", 3.0);

        CustomDisplayModifier displayModifier = new CustomDisplayModifier();
        CustomStudentInfoProvider studentInfoProvider = new CustomStudentInfoProvider();
        StudentInfoDisplay theDisplay = new StudentInfoDisplay (displayModifier, studentInfoProvider);

        theDisplay.display();


        AnotherDisplayModifier anotherdisplayModifier = new AnotherDisplayModifier();
        CustomStudentInfoProvider anotherStudentInfoProvider = new CustomStudentInfoProvider();
        StudentInfoDisplay anotherDisplay = new StudentInfoDisplay (anotherdisplayModifier, anotherStudentInfoProvider);

        anotherDisplay.display();
    }
}
