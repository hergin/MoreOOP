import interfaces.StudentInfoProvider;
import model.Student;

public class CustomStudentInfoProvider implements StudentInfoProvider {

    Student theStudent;

    public CustomStudentInfoProvider(Student student) {
        this.theStudent = student;
    }

    @Override
    public String getStudentName() {
        return theStudent.fullName();
    }

    @Override
    public int getStudentID() {
        return theStudent.getId();
    }
}
