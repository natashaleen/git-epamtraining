package additionaltask;

import java.util.*;

public class FirstPoem {
    private static final String POEM =
        "Two roads diverged in a yellow wood,\n"+
        "And sorry I could not travel both\n"+
        "And be one traveler, long I stood\n"+
        "And looked down one as far as I could\n"+
        "To where it bent in the undergrowth.\n"+
        "Then took the other, as just as fair,\n"+
        "And having perhaps the better claim,\n"+
        "Because it was grassy and wanted wear;\n"+
        "Though as for that the passing there\n"+
        "Had worn them really about the same.\n";

    private static final Comparator<String> lineLenghtComporator = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    };

    public static void main(String[] args) {
        List<String> poem = Arrays.asList(POEM.split("\n"));
        System.out.println("My FirstPoem\n " + poem);

        Collections.sort(poem, lineLenghtComporator);
        System.out.println("Sorted by line lenght\n " + poem);
    }
}
