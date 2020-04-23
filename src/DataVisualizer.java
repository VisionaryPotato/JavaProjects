import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public class DataVisualizer {

    public static void table(String Title, String headerName, String name){
        System.out.printf("%33s%n", Title);
        System.out.printf("%-20s|", headerName);
        System.out.printf("%23s%n", name);
        for(int i = 0; i <= 43; i++){
            System.out.print("-");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String title, headerName, name, fullString;
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
        name = scnr.nextLine();
        System.out.println("You entered: " + name); //
        System.out.println();

        System.out.println("Enter a data point (-1 to stop input):");
        fullString = scnr.nextLine();
        while(!(fullString.equals("-1"))) {
            if(fullString.contains(",")) {
                for(int i = 0; i < fullString.length(); i++){
                    if(fullString.charAt(i) == ','){
                        commaNum++;
                    }
                    if(commaNum > 1){
                        System.out.println("Error: Too many commas in input.");
                        System.out.println();
                        System.out.println("Enter a data point (-1 to stop input):");

                        fullString = scnr.nextLine();
                    }
                }

                commaVal = fullString.indexOf(",");
                stringComponents.add(fullString.substring(0, commaVal));
                try {
                    integerComponents.add(Integer.parseInt(fullString.substring(commaVal + 1)));
                }
                catch (Exception e){
                    System.out.println("Error: Comma not followed by an integer.");
                    System.out.println();

                }
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
        table(title, headerName, name);

    }
}
