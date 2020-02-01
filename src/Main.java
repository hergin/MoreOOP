import model.Student;

public class Main {

    public static void main(String[] args) {

        Student Jack = new Student("Jack",3.7);  //Create a Student instance

        CustomDisplayModifier displayModifier = new CustomDisplayModifier();  //Create CustomDisplayModifier

        CustomStudentInfoProvider studentInfoProvider = new CustomStudentInfoProvider(Jack);  //Create CustomStudentInfoProvider

        StudentInfoDisplay theDisplay = new StudentInfoDisplay(displayModifier, studentInfoProvider);  //Create an instance of StudentInfoDisplay

        theDisplay.display();  //Call the display method of that instance



        AnotherDisplayModifier anotherdisplayModifier = new AnotherDisplayModifier();  //Create AnotherDisplayModifier

        StudentInfoDisplay anotherDi = new StudentInfoDisplay(anotherdisplayModifier, studentInfoProvider);  //Create another instance of StudentInfoDisplay

        anotherDi.display();  //Call the display method


    }
}
