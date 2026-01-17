import java.util.*;

public class CollectionDemo {
    public static void collection(Integer n){
        Random random = new Random();

        System.out.println("a: ");
        Integer[] array = new Integer[n];

        for(int i = 0; i < n; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ;");
        }

        System.out.println("\nb: ");

        List<Integer> new_list = new ArrayList<>(Arrays.asList(array));
        System.out.print(new_list);

        System.out.println("\nc: ");

        Collections.sort(new_list);
        System.out.println(new_list + "sorted list");

        System.out.println("d: ");
        Collections.reverse(new_list);
        System.out.println(new_list + "reverse list");

        System.out.println("e: ");
        Collections.shuffle(new_list);
        System.out.println(new_list +  "shuffle list");

        System.out.println("f: ");
        Collections.rotate(new_list, 1);
        System.out.println(new_list + "rotate list");

        System.out.println("g: ");
        new_list.add(new_list.getLast());
        System.out.println(new_list);

        Set<Integer> not_duplications = new HashSet<>(new_list);

        List<Integer> listik = new ArrayList<>(not_duplications);
        System.out.println(listik);

        System.out.println("h: ");
        List<Integer> duplications = new_list.stream().filter(x -> Collections.frequency(new_list, x) > 1).toList();
        System.out.println(duplications);


        System.out.println("i: ");
        Integer[] array2 = new Integer[new_list.size()];
        new_list.toArray(array2);

        for(int i = 0; i <= n; i++) {
            System.out.print(array2[i] + " ;");
        }

        System.out.println("\nj: ");

        HashMap<Integer, Integer> counter = new HashMap<>();

        for (Integer integer : array2) {
            counter.put(integer, Collections.frequency(new_list, integer));
        }
        System.out.println(counter + "\n");
    }
}