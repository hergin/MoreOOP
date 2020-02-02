import interfaces.StudentInfoProvider;
import model.Student;

public class CustomStudentInfoProvider implements StudentInfoProvider {
    Student  aStudent;

    public CustomStudentInfoProvider(Student student ){
     aStudent =  student;

    }



    @Override
    public String getStudentName() {
        return aStudent.fullName();
    }

    @Override
    public int getStudentID() {
        return aStudent.getId();
    }
}
