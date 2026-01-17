import java.util.Iterator;

public class PrimesGeneratorTest {
    public PrimesGenerator generator;

    public PrimesGeneratorTest(PrimesGenerator generator) {
        this.generator = generator;

    }

    public void test(Integer n) {
        int i = 0;
        Iterator<Integer> iterator = generator.list.iterator();
        while (i < n && iterator.hasNext()) {
            System.out.print(iterator.next() + "; ");
            i++;
        }

        System.out.println();

        Iterator<Integer> iterator1 = generator.list.reversed().iterator();

        int ii = 0;
        while (ii < n && iterator1.hasNext()) {
            System.out.print(iterator1.next() + "; ");
            ii++;
        }



        }
    }
