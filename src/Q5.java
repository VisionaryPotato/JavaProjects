import java.util.*;
public class Q5 {

    /*
     * Method: fillArray
     *
     * Precondition: the method accepts a non-null String variable
     *              as an argument
     * Postcondition: Return a char array that has been filled from
     *                      the string passed to the method, each element
     *                      set to the corresponding character in the
     *                      string.
     *              (i.e. result[0]=the character at index 0 in the string)
     */
    public char[] fillArray(String var){

        if(var != null){
            char[] stringtoChar = new char[var.length()];
            for(int i = 0; i < stringtoChar.length; i++){
                stringtoChar[i] = var.charAt(i);
            }
            return stringtoChar;
        }
        System.out.println( "fillArray not implemented");
        return null;
    }

    /*
     * Method: productMatrix
     * precondition: 0 <= n <= 100
     * postcondition: if n is less than 1, return null
     * postcondition: if n is greater than zero, return a n x n matrix
     *                      with each element of the matrix set to
     *                      row index * column index.
     */
    public int[][] productMatrix(int n){

        if(n >= 0 && n <=100){
            if(n < 1){
                return null;
            }
            else{
                return productMatrix(n*n);
            }
        }

        System.out.println( "productMatrix not implemented");
        return null;
    }

    /*
     * Method: sumOfSquares
     * precondition: the method accepts an array of ints
     * postcondition: if the array is null or of size zero, return 0
     * postcondition: if the size of the array is greater than 1,
     *                      return an int equal to the sum of the
     *                      square of each element of the array.
     */
    public long sumOfSquares (int[] intArray) {
        if(intArray.length == 0){
            return 0;
        }
        if(intArray.length>1){
            long sum = 0;
            for(int i = 0; i < intArray.length; i++){
                intArray[i] = intArray[i] * intArray[i];
            }
            for(int i = 0; i<intArray.length; i++){
                sum += intArray[i];
            }
            return sum;

        }
        System.out.println( "sumOfSquares not implemented");
        return -1;
    }

    /*
     * Method: incPosArray
     * precondition: the method accepts an array of ints
     * postcondition: if the array is null or of size zero, simply return
     * postcondition: if the size of the array is greater than 1,
     *                      increment each positive element of the array,
     *                      leaving the negative elements and the elements
     *                      equal to zero set to their incoming values.
     */
    public void incPosArray (int[] intArray) {
        if(intArray == null){
            return;
        }
        else if(intArray.length > 1){
            for(int i = 0; i < intArray.length; i++){
                if(intArray[i] > 0){
                    intArray[i]++;
                }
            }
        }
        else {
            System.out.println("incPosArray not implemented");
            return;
        }
    }


    public static void main (String[] args) {
        Q5 q5 = new Q5();
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        sc.nextLine(); //throw away rest of the line
        switch(type){
            case 1:
                String s = sc.nextLine();
                char[] c = q5.fillArray(s);
                System.out.println(Arrays.toString(c));
                break;
            case 2:
                int in = sc.nextInt();
                int[][] o = q5.productMatrix(in);
                String[] stra = new String[o.length];
                for(int i = 0; i < stra.length; i++)
                    stra[i] = Arrays.toString(o[i]);
                System.out.println(Arrays.toString(stra));
                break;
            case 3:
                int num = sc.nextInt();
                sc.nextLine(); //throw away rest of the line
                int[] nums = new int[num];
                for(int i = 0; i < num; i++)
                    nums[i] = sc.nextInt();
                long el = q5.sumOfSquares(nums);
                System.out.println(el);
                break;
            case 4:
                int sz = sc.nextInt();
                sc.nextLine(); //throw away rest of the line
                int[] intz = new int[sz];
                for(int i = 0; i < sz; i++)
                    intz[i] = sc.nextInt();
                q5.incPosArray(intz);
                System.out.println(Arrays.toString(intz));
                break;
        }
    }
}