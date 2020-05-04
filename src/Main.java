public class Main {

    /* stringClean()
     * Given a string, return recursively a "cleaned" string
     * where adjacent chars that are the same have been reduced
     * to a single char. So "yyzzza" yields "yza".
     */
    public static String stringClean(String str){
        if ( str.length() <= 1 ) return str;
        if( str.substring(1,2).equals(str.substring(0,1)) ){
            return stringClean(str.substring(1));
        }
        else{
            return str.substring(0,1) + stringClean(str.substring(1));
        }
    }


    /* palindromeChecker()
     * Given a string, check if it is a palindrome recursively.
     * Return true if the given word is a palindrome, and false if it is not.
     * For example, "abcba" would yield true, but "abc" would not.
     * A word is a palindrome if the letters in the word are symmetric.
     */
    public static boolean palindromeChecker(String word){
        if(word.substring(1,2).equals(word.substring(0,1)) ){
            return true;
        }
        if(word.charAt(0) == word.charAt(word.length()-1)){
            return palindromeChecker(word.substring(1, word.length()-1));
        }
        return false;
    }



    /* reverseString()
     * Given a string, recursively reverse the letters to yield a new string.
     * For example, if given "abcde", the method would yield "edcba".
     */
    public static String reverseString(String word){
            if(word == null|| word.length() <= 1){
                return word;
            }
            return reverseString((word.substring(1)))+word.charAt(0);

        }
    /* totalWord()
     * Given a string, recursively find the sum of the integer values of the characters in the word.
     * Since characters have corresponding integer values from the ASCII table, you are able to sum them into a single integer.
     * For example, if given "abc", the method would return 294.
     */
    public static int totalWord(String word){
        if(word.equals("")){
            return 0;
        }

        if (word.charAt(0)=='-' || word.charAt(0)=='+') {
            int sign = word.charAt(0)=='+' ? 1 : -1;
            return totalWord(word.substring(1)) * sign;
        }
        return totalWord(word);

    }

        /*
         * The following method is given to you, and you will be responsible for completing the permutationHelper method it calls.
         * Sometimes, helper methods are used for recursive methods when another parameter is needed to recursively call a method repeatedly, but passing that parameter initially doesn't make sense.
         */


        /* permutationHelper()
         * This method is called by the permutation method.
         * Given a string, return a string that lists all possible permutations of the letters in the string, with spaces preceding each permutation.
         * For example, "123" would give "123 132 213 231 312 321".
         * The perm parameter keeps track of the current permutation you are creating.
         * Consider using the a for loop to call the method recursively a certain number of times with different parameters, so you cover all permutations.
         */
        public static void main(String[] args) {
            String word = "abc";
            System.out.println(stringClean(word));
            System.out.println(reverseString(word));
            System.out.println(totalWord(word));
        }

    }
