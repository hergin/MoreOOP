import model.*;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Payton",3.1);
        CustomStudentInfoProvider studentInfo = new CustomStudentInfoProvider(s1);
        CustomDisplayModifier displayModifier = new CustomDisplayModifier();
        StudentInfoDisplay theDisplay = new StudentInfoDisplay(displayModifier,studentInfo);
        theDisplay.display();
        AnotherDisplayModifier anotherDisplayModifier = new AnotherDisplayModifier();
        StudentInfoDisplay anotherDisplay = new StudentInfoDisplay(anotherDisplayModifier,studentInfo);
        anotherDisplay.display();
    }
}
