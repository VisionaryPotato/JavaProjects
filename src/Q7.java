public class Q7
{
    /**
     * selectionSort
     *
     * This method performs a selection sort on an array recursively.
     *
     * @param int[] values The array, full of integer values to sort
     * @param int start - The start index to begin sorting.  Nothing before this index should be changed!
     * @param int depth - This variable is decremented on the first line of the method.
     *                  If it is 0, return from the method immediately.
     *
     * Precondition: values is a valid int array with length >= 1.
     * Precondition: 0 <= start < values.length
     * Postcondition: The given array, from start, is sorted in place from smallest to largest.
     *                Exception: if Depth causes a return, then fewer values are sorted, as appropriate.
     *
     * Note: The method should recursively call itself to sort the rest of the values.
     *       You will need a loop, though, to select the next smallest value.
     */
    public static void selectionSort(int[] values, int start, int depth)
    {
        int tempVal;
        depth--;
        if(depth == 0) return;
        else if(values.length >= 1) {
            if (start >= 0 && start < values.length) {
                for (int i = 0; i < values.length; i++) {
                    for (int j = start; j < values.length; j++) {
                        if (values[j - 1] > values[j]) {
                            tempVal = values[j - 1];
                            values[j - 1] = values[j];
                            values[j] = tempVal;
                        }
                    }
                }
                for(int i = 0; i < values.length; i++){
                    System.out.println(values[i]);
                }
                //selectionSort(values, start, depth);
            }
        }
    }
    public static void main(String args []){
        int [] arrNum = {5, 4, 3, 2, 1};
        selectionSort(arrNum, 2, 6);
    }
    //Place your code below this comment.
}
