package codingQuestion;

import java.util.HashMap;
import java.util.Iterator;
import java.util.*;
public class IterateHashMap {

    public static void main(String[] args) {
      Map<String,String> map = new HashMap<>(Map.of( "kunal","sunder","subhash","suder sushee","tharun","hardworking" ));

       List<String> list = new ArrayList<>(List.of("kunal","agwnahs","heheeh","sss"));
        map.put("","");
        list.add("something");

        System.out.println(list);
        iteratHashMap(map);

        List<String> list2 = new ArrayList<>(Arrays.asList("A", "B"));
      ///  List<String> list3 = Arrays.asList("A", "B");
        System.out.println(list2);
        for (String s : list2) {
            if (s.equals("A"))
            {list2.remove(s);}
        }
        System.out.println(list2);

    }


    public static void  iteratHashMap(Map<?,?> hm) {

        Iterator<? extends Map.Entry<?, ?>> itr = hm.entrySet().iterator();

        while (itr.hasNext()){
            Map.Entry<?,?> entry = itr.next();
            System.out.println(entry.getKey()+" ------ "+entry.getValue());
        }

    }
}
