import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
import java.util.ArrayList;

public class DataVisualizer {
    public static void setString(){

    }
    public static void successful(String name, int dataInt){
        System.out.println("Data string: " + name);
        System.out.println("Data integer: " + dataInt);
    }
    public static void tooManyCommas(){
        System.out.println("Error: Too many commas in input.");
        System.out.println();
    }
    public static void notInt() {
        System.out.println("Error: Comma not followed by an integer.");
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String title, headerName, fullString;
        int number, commaNum =0, commaVal = 0;
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
                for(int i = 0; i < fullString.length(); i++){
                    if(fullString.charAt(i) == ',') {
                        commaNum++;
                    }
                }
                if(commaNum > 1){
                    tooManyCommas();
                    fullString = scnr.nextLine();
                }
                else{
                    commaVal = fullString.indexOf(",");
                    stringComponents.add(fullString.substring(0, commaVal));
                    try {
                        integerComponents.add(Integer.parseInt(fullString.substring(commaVal + 1)));
                    } catch (Exception e) {
                        notInt();
                        System.out.println("Enter a data point (-1 to stop input):");
                        fullString = scnr.nextLine();
                    }
                    for (int i = 0; i < integerComponents.size(); i++) {
                        stringCompVal = stringComponents.get(i);
                        intCompVal = integerComponents.get(i);
                    }
                    if (intCompVal == 0) {
                        notInt();
                    }
                    else{
                        successful(stringCompVal, intCompVal);
                    }
                }

            }
            else{
                System.out.println("Error: No comma in string.");
                System.out.println();
            }
            fullString = scnr.nextLine();
            if(fullString.equals("-1")){
                break;
            }
            else{
                System.out.println("Enter a data point (-1 to stop input):");
            }
            //System.out.println("Enter a data point (-1 to stop input):");
        }
        scnr.close();

    }
}
