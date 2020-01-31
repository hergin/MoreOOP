import interfaces.DisplayModifier;
import interfaces.StudentInfoProvider;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentInfoDisplayTest {

    @Test
    void produceDisplayStringTestNoBorders() {
        var defaultStudentInfoDisplay = new StudentInfoDisplay(new DisplayModifier() {
            @Override
            public boolean isBorderEnabled() {
                return false;
            }

            @Override
            public int getBorderWidth() {
                return 0;
            }

            @Override
            public boolean addVerticalSpace() {
                return false;
            }
        }, new StudentInfoProvider() {
            @Override
            public String getStudentName() {
                return "Student1";
            }

            @Override
            public int getStudentID() {
                return 1;
            }
        });

        var expectedDisplayString = "\nSTUDENT INFO DISPLAY\n" +
                "Student Name: Student1\n" +
                "Student ID  : 1\n" +
                "\n";
        var actualDisplayString = defaultStudentInfoDisplay.produceDisplayString();

        assertEquals(expectedDisplayString, actualDisplayString);
    }

    @Test
    void produceDisplayStringTestWithBorderOfWidth10() {
        var defaultStudentInfoDisplay = new StudentInfoDisplay(new DisplayModifier() {
            @Override
            public boolean isBorderEnabled() {
                return true;
            }

            @Override
            public int getBorderWidth() {
                return 10;
            }

            @Override
            public boolean addVerticalSpace() {
                return false;
            }
        }, new StudentInfoProvider() {
            @Override
            public String getStudentName() {
                return "Student1";
            }

            @Override
            public int getStudentID() {
                return 1;
            }
        });

        var expectedDisplayString = "**********\nSTUDENT INFO DISPLAY\n" +
                "Student Name: Student1\n" +
                "Student ID  : 1\n" +
                "**********\n";
        var actualDisplayString = defaultStudentInfoDisplay.produceDisplayString();

        assertEquals(expectedDisplayString, actualDisplayString);
    }
}