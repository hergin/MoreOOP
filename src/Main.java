import model.Student;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Kevin",3.0);
        CustomStudentInfoProvider studentInfo = new CustomStudentInfoProvider(s1);
        CustomDisplayModifier displayModifier = new CustomDisplayModifier();
        StudentInfoDisplay theDisplay = new StudentInfoDisplay(displayModifier,studentInfo);
        theDisplay.display();


        AnotherDisplayModifier anotherDisplayModifier = new AnotherDisplayModifier();
        StudentInfoDisplay anotherDisplay = new StudentInfoDisplay(anotherDisplayModifier,studentInfo);
        anotherDisplay.display();


    }




}
