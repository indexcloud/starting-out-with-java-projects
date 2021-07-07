/**
 * This class stores data about a course.
 */

public class Course {
    private String courseName;
    private Instructor instructor;
    private TextBook textBook;

    public Course(String name, Instructor instr, TextBook text) {
        courseName = name;

        instructor = new Instructor(instr);

        textBook = new TextBook(text);
    }

    public String getName() {
        return courseName;
    }

    public Instructor getInstructor() {
        return new Instructor(instructor);  // Deep copy
//        return instructor;  // Shallow copy
    }

    public TextBook getTextBook() {
        return new TextBook(textBook);  // Deep copy
//        return textBook;  // Shallow copy
    }

    public String toString() {
        String str = "Course name: " + courseName + "\nInstructor Information:\n" + instructor +
                "\nTextbook Information:\n" + textBook;

        return str;
    }
}
