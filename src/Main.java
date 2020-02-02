import model.Student;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Luke Holliday", 3.3);
        CustomStudentInfoProvider customStudentInfoProvider = new CustomStudentInfoProvider(s1);
        CustomDisplayModifier customDisplayModifier = new CustomDisplayModifier();
        StudentInfoDisplay sid1 = new StudentInfoDisplay(customDisplayModifier, customStudentInfoProvider);
        sid1.display();
        AnotherDisplayModifier anotherDisplayModifier = new AnotherDisplayModifier();
        StudentInfoDisplay sid2 = new StudentInfoDisplay(anotherDisplayModifier, customStudentInfoProvider);
        sid2.display();
    }

}

