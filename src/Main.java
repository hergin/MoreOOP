import model.Student;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Huseyin", 3.7);
        CustomStudentInfoProvider studentInfoProvider = new CustomStudentInfoProvider(student);

        CustomDisplayModifier customDisplayModifier = new CustomDisplayModifier();
        StudentInfoDisplay firstInstance = new StudentInfoDisplay(customDisplayModifier, studentInfoProvider);
        firstInstance.display();

        AnotherDisplayModifier anotherDisplayModifier = new AnotherDisplayModifier();
        StudentInfoDisplay secondInstance = new StudentInfoDisplay(anotherDisplayModifier, studentInfoProvider);
        secondInstance.display();
    }

}
