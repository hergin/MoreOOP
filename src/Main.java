import interfaces.DisplayModifier;
import interfaces.StudentInfoProvider;
import model.*;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Bob", 3.2);
        CustomDisplayModifier displayModifier = new CustomDisplayModifier();
        CustomStudentInfoProvider customStudentInfo = new CustomStudentInfoProvider();
        StudentInfoDisplay theDisplay = new StudentInfoDisplay(displayModifier, customStudentInfo);

        theDisplay.display();

        AnotherDisplayModifer anotherDisplayModifer = new AnotherDisplayModifer();

        StudentInfoDisplay theDisplay2 = new StudentInfoDisplay(anotherDisplayModifer,customStudentInfo);

        theDisplay2.display();;
        }
    }
