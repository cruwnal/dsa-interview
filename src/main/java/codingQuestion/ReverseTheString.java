package codingQuestion;

public class ReverseTheString {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("kunalnagwanshi");
        reverseString(sb,0,sb.length()-1);
        System.out.println(sb);
    }


    public static void reverseString(StringBuilder sb , int left, int right){
        if(left>right) return;
        char temp = sb.charAt(left);
        sb.setCharAt(left,sb.charAt(right));
        sb.setCharAt(right,temp);


        reverseString(sb,left+1,right-1);



    }
}
