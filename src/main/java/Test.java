
import com.google.gson.Gson;

import java.util.Date;

class User{
    private String name;
    private Integer age;
    private java.util.Date birthday;

    public User(String name, Integer age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }
}


public class Test {
    public static void main(String...args){
        User tom = new User("tom",15,new Date());
        Gson gson = new Gson();
        String tomStr = gson.toJson(tom);
        System.out.println(tomStr);

        User newTom = gson.fromJson(tomStr,User.class);
        System.out.print(newTom);
    }

}
