import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class DescendingOrder {
    // TODO: Write a void method selectionSortDescendTrace() that takes
    //       an integer array and the number of elements in the array as arguments,
    //       and sorts the array into descending order.
    public static void selectionSortDescendTrace(int [] numbers, int numElements) {
            int i;
            int j;
            int temp;      // Temporary variable for swap

            for (i = 1; i < numElements; ++i) {
                j = i;
                // Insert numbers[i] into sorted part
                // stopping once numbers[i] in correct position
                while (j > 0 && numbers[j] > numbers[j - 1]) {

                    // Swap numbers[j] and numbers[j - 1]
                    temp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = temp;
                    --j;
                    for(int k = 0; k<numElements - 1; k++){
                        System.out.print(numbers[k] + " ");
                    }
                }

            }
    }


    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int input, i = 0;
        int numElements = 0;
        int[] numbers = new int[10];
        input = scnr.nextInt();
        for(i = 0; i<numbers.length; i++ ){
            if(input == -1){
            }
            else{
                numbers[i] = input;
                numElements++;
                input = scnr.nextInt();
            }
        }
        selectionSortDescendTrace(numbers, numElements);



        // TODO: Read in a list of up to 10 positive integers; stop when
        //       -1 is read. Then call selectionSortDescendTrace() method.

    }
}

