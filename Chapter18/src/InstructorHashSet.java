import java.util.*;

public class InstructorHashSet {
    public static void main(String[] args)
    {
        Set<Instructor> instructorSet = new HashSet<>();

        instructorSet.add(new Instructor("Warren", "Tom", "101"));
        instructorSet.add(new Instructor("Doe", "Jane", "102"));
        instructorSet.add(new Instructor("Bryant", "Kobe", "103"));
        instructorSet.add(new Instructor("Harden", "James", "104"));
        instructorSet.add(new Instructor("Rose", "Derrick", "105"));

        System.out.println("These are the instructors in the set:\n");
        for (Instructor ins : instructorSet)
        {
            System.out.println(ins);
            System.out.println();
        }

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter information below to search instructor.");
        System.out.println("Please enter instructor last name:");
        String lname = keyboard.nextLine();

        System.out.println("Please enter instructor first name:");
        String fname = keyboard.nextLine();

        System.out.println("Please enter instructor office number:");
        String office = keyboard.nextLine();

        Instructor newInstructor = new Instructor(lname, fname, office);
        System.out.println("Searching...");
        if (instructorSet.contains(newInstructor))
        {
            System.out.println("Instructor found.");
        } else
        {
            System.out.println("Instructor not found.");
        }
    }
}
