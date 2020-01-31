package model;

import interfaces.DisplayModifier;
import interfaces.StudentInfoProvider;

public class StudentInfoDisplay {

    DisplayModifier displayModifier;
    StudentInfoProvider studentInfoProvider;

    int newLineCount = 0;

    public StudentInfoDisplay(DisplayModifier displayModifier, StudentInfoProvider studentInfoProvider) {
        this.displayModifier = displayModifier;
        this.studentInfoProvider = studentInfoProvider;

        if (displayModifier.addVerticalSpace())
            newLineCount = 1;
    }


    public void display() {
        System.out.println(produceDisplayString());
    }
    
    public String produceDisplayString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(getBorder() + "\n");
        stringBuilder.append(getVerticalSpace());
        stringBuilder.append("STUDENT INFO DISPLAY\n");
        stringBuilder.append(getVerticalSpace());
        stringBuilder.append("Student Name: " + studentInfoProvider.getStudentName() + "\n");
        stringBuilder.append(getVerticalSpace());
        stringBuilder.append("Student ID  : " + studentInfoProvider.getStudentID() + "\n");
        stringBuilder.append(getVerticalSpace());
        stringBuilder.append(getBorder() + "\n");

        return stringBuilder.toString();
    }

    /**
     * Produce a border of borderWidth if displayModifier says so.
     * To use internally.
     *
     * @return
     */
    private String getBorder() {
        if (displayModifier.isBorderEnabled())
            return "*".repeat(displayModifier.getBorderWidth());
        return "";
    }

    /**
     * Produce newLineCount amount of new lines to put in between lines.
     * To use internally.
     *
     * @return
     */
    private String getVerticalSpace() {
        return "\n".repeat(newLineCount);
    }
}
