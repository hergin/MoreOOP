import interfaces.StudentInfoProvider;
import model.Student;

public class CustomStudentInfoProvider implements StudentInfoProvider {

    private Student student;

    public CustomStudentInfoProvider(Student student) {
        this.student = student;
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
