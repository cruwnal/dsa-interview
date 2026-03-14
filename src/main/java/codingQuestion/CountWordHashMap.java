package codingQuestion;

import java.util.HashMap;

public class CountWordHashMap {


    public static void main(String[] args) {
        System.out.println(getCountOfWords("kunalnagwanshihelloo"));
    }

    public static HashMap<Character,Integer> getCountOfWords(String s){
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
return  hm;
    }

}
