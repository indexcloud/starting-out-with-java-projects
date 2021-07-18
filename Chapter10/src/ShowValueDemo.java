/**
 * This program demonstrates the methods in the SuperClass3 and SubClass3 classes.
 */

public class ShowValueDemo {
    public static void main(String[] args) {
        SubClass3 myObject = new SubClass3();

        myObject.showValue(10);
        myObject.showValue(1.2);
        myObject.showValue("Hello");
    }
}
