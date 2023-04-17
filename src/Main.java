import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Huffman newbie = new Huffman();

        String test = "quoicoubeh";

        HashMap<Character,Integer> ret = newbie.getOccurences(test);

        System.out.println(ret);

    }
}