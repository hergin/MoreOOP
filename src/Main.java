import model.Student;

public class Main {

    private static Student johnJames = new Student("John James", 3.5);
    private static CustomStudentInfoProvider customStudentInfoProvider = new CustomStudentInfoProvider(johnJames);

    public static void main(String[] args){
        CustomDisplayModifier customModifier = new CustomDisplayModifier();
        StudentInfoDisplay studentDisplay = new StudentInfoDisplay(customModifier, customStudentInfoProvider);
        studentDisplay.display();

        AnotherDisplayModifier anotherCustomModifier = new AnotherDisplayModifier();
        StudentInfoDisplay anotherStudentDisplay = new StudentInfoDisplay(anotherCustomModifier, customStudentInfoProvider);
        anotherStudentDisplay.display();
    }
}
