import java.util.*;
public class ParseStrings {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        String fullString, firstName, lastName, fullStringTO;
        Scanner inSS = null;
        Scanner SS = null;
        System.out.println("Enter input string:");
        fullString = scnr.nextLine();

        while (!(fullString.equals("q"))) {
            if (fullString.contains(",")) {
                inSS = new Scanner(fullString);
                firstName = inSS.next();
                if(inSS.hasNext()) {
                    System.out.println("First word: " + firstName.replace(",", ""));
                    lastName = inSS.next();
                    if (lastName.contains(",")) {
                        lastName = inSS.next().replace(",", "");
                        System.out.println("Second word: " + lastName);
                        System.out.println();
                    } else {
                        System.out.println("Second word: " + lastName);
                        System.out.println();
                    }
                    System.out.println("Enter input string:");
                    fullString = scnr.nextLine();
                }
                else{
                   SS = new Scanner (fullString.replace(",", " "));
                   firstName = SS.next();
                    lastName = SS.next();
                    System.out.println("First word: " + firstName);
                    System.out.println("Second word: " + lastName);
                    System.out.println();
                    System.out.println("Enter input string:");
                    fullString = scnr.nextLine();
                }
            }
            else {
                System.out.println("Error: No comma in string.\n");
                System.out.println("Enter input string:");
                fullString = scnr.nextLine();
            }

        }

    }
}

/* Type your code here. */


