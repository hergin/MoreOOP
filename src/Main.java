import interfaces.DisplayModifier;
import interfaces.StudentInfoProvider;
import model.*;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("ross", 3.01);
        CustomDisplayModifier displayModifier = new CustomDisplayModifier();
        CustomStudentInfoProvider yes = new CustomStudentInfoProvider(s1);
        StudentInfoDisplay theDisplay = new StudentInfoDisplay(displayModifier, yes);
        theDisplay.display();
        AnotherDisplayModifier anotherModifier = new AnotherDisplayModifier();
        StudentInfoDisplay another1 = new StudentInfoDisplay(anotherModifier, yes);
        another1.display();



    }
}
