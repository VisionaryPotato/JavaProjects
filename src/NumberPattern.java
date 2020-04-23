import java.util.Scanner;

public class NumberPattern {
    // TODO: Write recursive printNumPattern() method
    static void printNumPattern(int num1, int num2){
        int origVal = num1;
        if(num1 > 0){
            System.out.print(num1 + " ");
            while (!((num1 == 0) || num1 < 0)){
                for(int i = 0; i < num1; i++){
                    num1 = num1 - num2;
                    System.out.print(num1 + " ");
                }
            }
            while (!(num1 == origVal)){
                for(int i = origVal; i >= num1; i--){
                    num1 = num1 + num2;
                    System.out.print(num1 + " ");
                }
            }

        }

    }

    static int frac(int n){

        if(n >= 1){ return n * frac(n-1);}
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num1;
        int num2;

        num1 = scnr.nextInt();
        num2 = scnr.nextInt();
        printNumPattern(num1, num2);
        System.out.println();
        System.out.println(frac(num1));
    }
} 