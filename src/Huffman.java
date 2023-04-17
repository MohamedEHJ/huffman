import java.util.HashMap;

public class Huffman {

    /***
     * Returns a HashMap with the number of occurences of each character in the word
     * @param word String to be analyzed
     * @return HashMap<Character, Integer>
     */
    public HashMap<Character, Integer> getOccurences(String word) {
        HashMap<Character, Integer> occurencesList = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            if (occurencesList.containsKey(word.charAt(i))) {
                occurencesList.put(word.charAt(i), occurencesList.get(word.charAt(i)) + 1);
            } else {
                occurencesList.put(word.charAt(i), 1);
            }
        }

        return occurencesList;
    }
}

