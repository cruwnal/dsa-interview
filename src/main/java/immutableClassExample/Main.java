package immutableClassExample;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User friend1 = new User("Rahul",25,new ArrayList<>());
        User friend2 = new User("Aman",28,new ArrayList<>());
        List<User> friends = new ArrayList<>();
        friends.add(friend1);
        friends.add(friend2);
        User user = new User("Kunal",30,friends);

        user.getFriends().add(new User("pankaj",25,new ArrayList<>()));
        System.out.println( user.getFriends());
    }
}
