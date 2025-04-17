/*Create a java program to demonstrate common exceptions
NullPointerException:
Create a variable without initializing it.
Attempt to access a method or field of the null reference.
ArrayIndexOutOfBoundsException:
Access an array element with an invalid index.
Declare an array of a certain size and try to access an element beyond that size.
NumberFormatException:
Attempt to parse a string that cannot be converted to a number.
Use Integer.parseInt() or Double.parseDouble() on invalid input.
ClassCastException:
Attempt to cast an object to an incompatible type.
Try to cast an Object to a String when it's actually an Integer.
*/
//praactical no 16
public class CommonExceptionsDemo {

    public static void main(String[] args) {

        // 1. NullPointerException
        try {
            String str = null; // not initialized
            System.out.println("Length of string: " + str.length()); // accessing method of null reference
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }

        // 2. ArrayIndexOutOfBoundsException
        try {
            int[] numbers = new int[3]; // Array of size 3
            numbers[5] = 10; // Invalid index access
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // 3. NumberFormatException
        try {
            String invalidNumber = "abc123";
            int result = Integer.parseInt(invalidNumber); // Invalid number format
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }

        // 4. ClassCastException
        try {
            Object obj = Integer.valueOf(10); // obj is actually an Integer
            String s = (String) obj; // Invalid cast to String
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }

        System.out.println("Program finished.");
    }
}
