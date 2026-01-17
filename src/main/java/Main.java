import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        CollectionDemo.collection(15);

        PrimesGeneratorTest test = new PrimesGeneratorTest(new PrimesGenerator(10));
        test.test(3);

        HumanDemo.main();

        String text = "Goldilocks and the Three Bears is a classic English " +
                "fairy tale that has been enjoyed by children for " +
                "generations. The story is simple yet engaging, and it " +
                "teaches important lessons about honesty and consequences. " +
                "The characters are also very memorable, making it an " +
                "ideal story for English learners. In addition, the " +
                "story is short enough to be easily digestible, but " +
                "it still contains enough detail to be interesting. " +
                "All of these factors make Goldilocks and the Three " +
                "Bears an excellent book for English learners of all " +
                "levels.";
        EngWord.engWord(text);

        HashMap<Integer, String> dictReverse = new HashMap<Integer, String>();
        dictReverse.put(1, "Goldilocks");
        dictReverse.put(2, "Three Bears");
        dictReverse.put(3, "English");
        dictReverse.put(4, "Easily");
        dictReverse.put(5, "Almost");
        dictReverse.put(6, "Ill");

        System.out.println(KeyReverse.KeyReverse(dictReverse));
    }

}
