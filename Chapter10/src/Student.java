/**
 * The Student class ia an abstract class that holds general data about a student. Classes representing specific types
 * of students should inherit from this class.
 */

public abstract class Student {
    private String name;
    private String idNumber;
    private int yearAdmitted;

    public Student(String n, String id, int year) {
        name = n;
        idNumber = id;
        yearAdmitted = year;
    }

    public String toString() {
        String str;

        str = "Name: " + name + "\nID Number: " + idNumber + "\nYear Admitted: " + yearAdmitted;
        return str;
    }

    public abstract int getRemainingHours();
}
