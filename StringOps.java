public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
    }

    public static String capVowelsLowRest (String string) {
        // Write your code here:
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            //changes small vowel to cap and adds it
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                result += (char) (c - 32);
            } else if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                //adds cap vowel
                result += c;
            } else if (c >= 'B' && c <= 'Z') {
                //adds uncapped non-vowel
                result = result + (char)(c + 32);
            }else result += c;
        }
        return result;
    }

    public static String camelCase (String string) {
        String result = "";
        result += (string.charAt(0) != ' ') ? string.charAt(0) : "";

        for (int i = 1; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c != ' '){
                //checks if last char was a space and changes current letter to cap if needed
                if (string.charAt( i -1) == ' '){
                    result += (c >= 'a' && c <= 'z')
                            ? (char)(c - 32) : c;
                } else{
                    //adds letter in uncapped version
                    result += (c >='A' && c<= 'Z')
                            ? (char)(c + 32) : c;
                }
            }
        }

        if (result.length() == 0) //result.isEmpty() is better but not allowed
            return "";
        //create first letter in lower case
        char firstChar = (result.charAt(0) >='A' && result.charAt(0)<= 'Z')
                ? (char)(result.charAt(0) + 32) : result.charAt(0);

        if (result.length() >= 2)
            return firstChar + result.substring(1);

        //edge case when there is only 1 letter
        result = "" + firstChar;
        return result;
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) count++;
        }

        int[] indexes = new int[count];
        int arrayIndex = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr){
                //adds index to array and advances array index
                indexes[arrayIndex] = i;
                arrayIndex++;
            }
        }
        return  indexes;
    }
}
