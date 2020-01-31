import model.Student;

public class Main {

    public static void main(String[] args) {
        Student studentJoe = new Student("Joe", 3.5);

        CustomDisplayModifier studentDisplayModifier = new CustomDisplayModifier();
        CustomStudentInfoProvider studentJoeInfoProvider = new CustomStudentInfoProvider(studentJoe);
        StudentInfoDisplay display1 = new StudentInfoDisplay(studentDisplayModifier, studentJoeInfoProvider);
        display1.display();

        AnotherDisplayModifier anotherStudentDisplayModifier = new AnotherDisplayModifier();
        StudentInfoDisplay display2 = new StudentInfoDisplay(anotherStudentDisplayModifier, studentJoeInfoProvider);
        display2.display();

    }
}
