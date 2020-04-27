import java.util.Arrays;
import java.util.Scanner;

public class LabProgram {

    /* Define your method here */
    public static void sortArray(int[] myArr, int arrSize){
        int tempVal;
        for(int i = 1; i < arrSize; i++){
            for(int j = 1; j < myArr.length; j++){
                if(myArr[j - 1] > myArr[j]){
                    tempVal = myArr[j-1];
                    myArr[j - 1] = myArr[j];
                    myArr[j] = tempVal;
                }
            }
        }
        for(int k = 0; k < myArr.length; k++){
            System.out.print(myArr[k] + " ");
        }

    }

    public static void main(String[] args) {
        Scanner numValue = new Scanner(System.in);
        int arrSize;
        arrSize = numValue.nextInt();
        int[] myArray = new int[arrSize];
        for(int i = 0; i<myArray.length; i++){
            myArray[i] = numValue.nextInt();
        }
        sortArray(myArray, arrSize);


    }
}
