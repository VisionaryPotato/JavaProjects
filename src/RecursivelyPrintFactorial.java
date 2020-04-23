import java.util.Scanner;

public class RecursivelyPrintFactorial {
    public static void printFactorial(int factCounter, int factValue) {
        int nextCounter;
        int nextValue;

        if (factCounter == 0) { // Base case: 0! = 1
            System.out.println("1");
        }
        else if (factCounter == 1) { // Base case: Print 1 and result
            System.out.println(factCounter + " = " + factValue);
        }
        else { // Recursive case
            System.out.print(factCounter + " * ");
            nextCounter = factCounter - 1;
            nextValue = nextCounter * factValue;
            while (!(nextCounter >= 1)){
                nextCounter = factCounter - 1;
                System.out.println(nextCounter);
                nextCounter = factCounter - 1;
            }


        }
    }

    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        int userVal;

        userVal = scnr.nextInt();
        System.out.print(userVal + "! = ");
        printFactorial(userVal, userVal);
    }
}