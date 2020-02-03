import model.AnotherCustomDisplayModifier;
import model.CustomDisplayModifier;
import model.CustomStudentInfoProvider;
import model.Student;

public class Main {

        public static void main(String[] args) {
            Student s1 = new Student("Hello", 3.7);

            CustomDisplayModifier displayModifier = new CustomDisplayModifier();

            CustomStudentInfoProvider studentDisplay = new CustomStudentInfoProvider(s1);

            StudentInfoDisplay theDisplay = new StudentInfoDisplay(displayModifier, studentDisplay);

            theDisplay.display();

            AnotherCustomDisplayModifier displayModifier1 = new AnotherCustomDisplayModifier();

            StudentInfoDisplay anotherDi = new StudentInfoDisplay(displayModifier1, studentDisplay);

            anotherDi.display();
        }
    }

