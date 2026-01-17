import java.util.Comparator;

class HumanComparatorByLastName implements Comparator<Human> {
    public static void main(String[] args) {

    }

    @Override
    public int compare(Human sur1, Human sur2) {
        return sur1.surname.compareTo(sur2.surname);
    }
}
