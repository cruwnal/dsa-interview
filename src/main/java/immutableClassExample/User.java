package immutableClassExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User {
    private final String name;
    private final int age;
    private final List<User> friends;

    User(String name,int age, List<User>friends){
        this.name=name;
        this.age=age;
        this.friends=  new ArrayList<>(friends);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<User> getFriends(){
        return Collections.unmodifiableList(friends);
    }


}
