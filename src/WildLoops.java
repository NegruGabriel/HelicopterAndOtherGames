import java.util.ArrayList;
import java.util.Scanner;

public class WildLoops {
    public static void main(String[] args) {
        String sentence = "flapjacks are awesome!";
        Scanner scan = new Scanner(sentence);
        ArrayList<String>words = new ArrayList<String>();

        while (scan.hasNext()) {
            words.add(scan.next());
        }
        System.out.println(words);


    }
}
