package interfaces;

import model.Student;

public class CustomStudentInfoProvider implements StudentInfoProvider {

    Student student = new Student("",0.0);

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
