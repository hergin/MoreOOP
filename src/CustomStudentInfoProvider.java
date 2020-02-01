import interfaces.StudentInfoProvider;
import model.Student;

public class CustomStudentInfoProvider implements StudentInfoProvider {

    Student student;  //This custom class will have one student in it as an attribute

    public CustomStudentInfoProvider(Student student){
        this.student=student;
    }

    //Add the unimplemented methods to make IDE happy

    @Override
    public String getStudentName() {
        return student.fullName();  //getStudentName will return the name of that one student
    }

    @Override
    public int getStudentID() {
        return student.getId();  //getStudentId will return the ID of that one student again
    }

}
