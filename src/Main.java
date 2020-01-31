import model.Student;

public class Main {

    public static void main(String[] args) {
        //Initial Student and infoprovider
        Student s1 = new Student("Jacob Bishop", 3.2);
        CustomStudentInfoProvider customStudentInfoProvider = new CustomStudentInfoProvider(s1);
        //Creating a custom display modifier
        CustomDisplayModifier customDisplayModifier = new CustomDisplayModifier();
        StudentInfoDisplay sid1 = new StudentInfoDisplay(customDisplayModifier, customStudentInfoProvider);
        //Displaying it with custom display modifier
        sid1.display();
        //Creating another display modifier different from the first
        AnotherDisplayModifier anotherDisplayModifier = new AnotherDisplayModifier();
        StudentInfoDisplay sid2 = new StudentInfoDisplay(anotherDisplayModifier, customStudentInfoProvider);
        //Displaying it with another display modifier
        sid2.display();
    }

}
