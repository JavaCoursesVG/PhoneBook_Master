package javaschool.app;

import asg.cliche.Command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mebo on 03.04.2017..
 */
public class Person extends PhoneBook {
    private static int count = 0;
    private int id;
    private String name;
    private String email;
    private final List<String> phones = new ArrayList<>();
// test
    public Person() {
        count++;
        id = count;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Command
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    @Command
    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getPhones() {
        return phones;
    }

    @Command
    public void addPhones(String... phones) {
        this.phones.addAll(Arrays.asList(phones));
    }

}
