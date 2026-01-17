import java.util.Comparator;
public class Human implements Comparable<Human> {

    String name;
    Integer age;
    String surname;

    public Human(String name, Integer age, String surname) {
        this.name = name;
        this.age = age;
        this.surname = surname;
    }

    @Override
    public int compareTo(Human sur) {
        return this.surname.compareTo(sur.surname);
    }

    @Override
    public String toString() {
        return surname + " " + name + " " + age;
    }
}
