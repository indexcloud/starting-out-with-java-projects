/**
 * This program demonstrates teh toString and equals methods that are inherited from the Object class.
 */

public class ObjectMethods {
    public static void main(String[] args) {
        PassFailExam exam1 = new PassFailExam(0, 0, 0);
//        PassFailExam exam2 = new PassFailExam(0, 0, 0);
        PassFailExam exam2 = exam1;

        System.out.println(exam1);
        System.out.println(exam2);

        if (exam1.equals(exam2))
            System.out.println("They are the same.");
        else
            System.out.println("The are not the same.");
    }
}
