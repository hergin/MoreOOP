import interfaces.StudentInfoProvider;
import model.Student;

public class CustomStudentInfoProvider implements StudentInfoProvider {
    Student s1 = new Student("Boo", 3.0);

    @Override
    public String getStudentName() {
        return s1.fullName();
    }

    @Override
    public int getStudentID() {
        return s1.getId();
    }
}
