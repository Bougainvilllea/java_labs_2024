import java.util.ArrayList;

public class OddEvenSeparator {
    ArrayList<Integer> list_even = new ArrayList<>();
    ArrayList<Integer> list_odd = new ArrayList<>();

    public void addNumber(int number) {
        if (number % 2 == 0) {
            list_even.add(number);
        }
        else {
            list_odd.add(number);
        }
    }
    public void even(){

        System.out.println(list_even);
    }
    public void odd(){

        System.out.println(list_odd);
    }
}
