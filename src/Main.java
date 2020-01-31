import model.Student;

public class Main {

    public static void main(String[] args) {

        Student myStudent = new Student("Jacob", 3.9);
        CustomStudentInfoProvider customStudentInfoProvider = new CustomStudentInfoProvider(myStudent);
        CustomDisplayModifier displayModifier = new CustomDisplayModifier();
        StudentInfoDisplay display1 = new StudentInfoDisplay(displayModifier, customStudentInfoProvider);
        display1.display();

        AnotherDisplayModifier anotherDisplayModifier = new AnotherDisplayModifier();
        StudentInfoDisplay display2 = new StudentInfoDisplay(anotherDisplayModifier, customStudentInfoProvider);
        display2.display();
    }
}