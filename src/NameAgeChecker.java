import java.util.Scanner;
import java.util.InputMismatchException;

public class NameAgeChecker {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String inputName;
        int age;

        inputName = scnr.next();
        while (!inputName.equals("-1")) {
            // FIXME: The following line will throw an InputMismatchException.
            //        Insert a try/catch statement to catch the exception.
            try {
                age = scnr.nextInt();
                System.out.println(inputName + " " + (age + 1));
            }
            catch (InputMismatchException e ){
                age = 0;
                System.out.println(inputName + " " + (age));
                inputName = scnr.next();
                age = scnr.nextInt();
            }
            inputName = scnr.next();
        }
    }
}
/*

Lee 18
Lua 21
Mary Beth 19
Stu 33
-1



 */