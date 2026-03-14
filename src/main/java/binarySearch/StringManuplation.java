package binarySearch;
/* Give a String s of lower case character, return the count of the pairs (i,j)  such as s[i] is 'a' and s[j] is g */
public class StringManuplation {

    public static void main(String[] args) {
        String s = "abegag";
        System.out.println(charPairCount(s));



    }
    public static int charPairCount(String s){
        int result =0;
        char tg1 = 'a';
        char tg2 = 'g';
        for(int i =0; i<s.length();i++){
            if(s.charAt(i)=='a'){
                for(int j = i+1; j<s.length();j++){
                    if(s.charAt(j)=='g'){

                        result++;
                    }

                }
            }
        }


        return result;
    }

}
