import java.util.*;

public class HumanDemo {
    public static void main() {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Elizaveta", 19, "Berdnikova"));
        humans.add(new Human("Timofey", 20, "Kislitsyn"));
        humans.add(new Human("Optimus", 700000000 , "Prime"));



        System.out.println("\nComparable:");
        Collections.sort(humans);
        for (Human human : humans) {
            System.out.println(human.surname + " " + human.name + " " + human.age);
        }


        System.out.println("\n" + "letters:" + "\n");
        HumanComparatorByLastName comparator = new HumanComparatorByLastName();
        humans.sort(comparator);
        for (Human human : humans) {
            System.out.println(human.surname + " " + human.name + " " + human.age);
        }

        Collections.shuffle(humans);

        // Сет из списка
        System.out.println("\n" + "a)" + "\n");

        HashSet<Human> setA = new HashSet<>(humans);
        System.out.println(setA);

        // Сет - сохраняет последовательность
        System.out.println("\n" + "b)" + "\n");
        LinkedHashSet<Human> setB = new LinkedHashSet<>(humans);
        System.out.println(setB);

        // Сет - интерфейс Comparable
        System.out.println("\n" + "c)" + "\n");
        TreeSet<Human> setC = new TreeSet<>(humans);
        System.out.println(setC);

        // интерфейс comparator
        System.out.println("\n" + "d)" + "\n");
        TreeSet<Human> setD = new TreeSet<>(comparator);
        setD.addAll(humans);
        System.out.println(setD);

        // анонимный comparator
        System.out.println("\n" + "e)" + "\n");
        TreeSet<Human> setE = new TreeSet<>((human1, human2 ) -> Integer.compare(human1.age, human2.age));
        setE.addAll(humans);
        System.out.println(setE);
    }
}
