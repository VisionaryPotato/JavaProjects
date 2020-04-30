public class Main {


    public static void main(String[] args) {

    }


    /* stringClean()
     * Given a string, return recursively a "cleaned" string
     * where adjacent chars that are the same have been reduced
     * to a single char. So "yyzzza" yields "yza".
     */
    public String stringClean(String str){

    }


    /* palindromeChecker()
     * Given a string, check if it is a palindrome recursively.
     * Return true if the given word is a palindrome, and false if it is not.
     * For example, "abcba" would yield true, but "abc" would not.
     * A word is a palindrome if the letters in the word are symmetric.
     */
    public boolean palindromeChecker(String word){

    }


    /* reverseString()
     * Given a string, recursively reverse the letters to yield a new string.
     * For example, if given "abcde", the method would yield "edcba".
     */
    public String reverseString(String word){

    }

    /* totalWord()
     * Given a string, recursively find the sum of the integer values of the characters in the word.
     * Since characters have corresponding integer values from the ASCII table, you are able to sum them into a single integer.
     * For example, if given "abc", the method would return 294.
     */
    public int totalWord(String word){

    }

    /*
     * The following method is given to you, and you will be responsible for completing the permutationHelper method it calls.
     * Sometimes, helper methods are used for recursive methods when another parameter is needed to recursively call a method repeatedly, but passing that parameter initially doesn't make sense.
     */
    public String permutation(String word){
        return permutationHelper(" ", word);
    }

    /* permutationHelper()
     * This method is called by the permutation method.
     * Given a string, return a string that lists all possible permutations of the letters in the string, with spaces preceding each permutation.
     * For example, "123" would give "123 132 213 231 312 321".
     * The perm parameter keeps track of the current permutation you are creating.
     * Consider using the a for loop to call the method recursively a certain number of times with different parameters, so you cover all permutations.
     */
    public String permutationHelper(String perm, String word) {

    }
}
