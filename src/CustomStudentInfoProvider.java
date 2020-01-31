import interfaces.StudentInfoProvider;
import model.Student;

public class CustomStudentInfoProvider implements StudentInfoProvider {

    Student student;

    public CustomStudentInfoProvider(Student aStudent){
        this.student = aStudent;
    }

    @Override
    public String getStudentName() {
        return student.fullName();
    }

    @Override
    public int getStudentID() {
        return student.getId();
    }
}
