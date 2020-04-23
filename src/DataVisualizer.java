import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
import java.util.ArrayList;

public class DataVisualizer {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String title, headerName, fullString;
        int number, commaNum =0, commaVal;
        Scanner inSS = null;
        ArrayList<String> stringComponents = new ArrayList<>();
        ArrayList<Integer>integerComponents = new ArrayList<>();

        String stringCompVal = "";
        int intCompVal = 0;

        System.out.println("Enter a title for the data:");      //TITLE
        title = scnr.nextLine();
        System.out.println("You entered: " + title);
        System.out.println();
        //Header of columns Down bellow
        System.out.println("Enter the column 1 header:"); //
        headerName = scnr.nextLine();
        System.out.println("You entered: " + headerName);
        System.out.println();
        System.out.println("Enter the column 2 header:");
        headerName = scnr.nextLine();
        System.out.println("You entered: " + headerName); //
        System.out.println();

        System.out.println("Enter a data point (-1 to stop input):");
        fullString = scnr.nextLine();
        while(!(fullString.equals("-1"))) {
            if(fullString.contains(",")) {
                commaVal = fullString.indexOf(",");

                stringComponents.add(fullString.substring(0, commaVal));

                integerComponents.add(Integer.parseInt(fullString.substring(commaVal + 1)));
                for(int i = 0; i<fullString.length();i++){
                    commaNum += fullString.indexOf(",");
                }
                for(int i = 0; i< integerComponents.size(); i++) {
                    stringCompVal = stringComponents.get(i);
                    intCompVal = integerComponents.get(i);
                }
                System.out.println("Data string: " + stringCompVal);
                System.out.println("Data integer: " + intCompVal);
                System.out.println();
            }
            else{
                System.out.println("Error: No comma in string.");
                System.out.println();
            }
            System.out.println("Enter a data point (-1 to stop input):");
            fullString = scnr.nextLine();
        }


    }
}
