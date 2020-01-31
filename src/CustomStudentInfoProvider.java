import interfaces.StudentInfoProvider;
import model.Student;

public class CustomStudentInfoProvider implements StudentInfoProvider {
    private Student student;

    public CustomStudentInfoProvider(Student aStudent){
        student = aStudent;

    }

    @java.lang.Override
    public String getStudentName() {
        return student.fullName();
    }

    @java.lang.Override
    public int getStudentID() {
        return student.getId();
    }
}
