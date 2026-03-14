package codingQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionPlaying {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2,4,6,8));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }

        System.out.println(list);

        list.removeIf(n->n%2==0);






        //-------------------------------
        //------------------------------


    }
}
