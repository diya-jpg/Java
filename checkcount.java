
import java.util.HashMap;

public class checkcount {
    public static void main(String[] args) {
        String str = "Hello World.Welcome to the world of programmer to ";
        
        // convert to lowercase for uniformity & split into words
        String[] words = str.toLowerCase().split("\\W+"); // split on non-word chars (like space, dot)

        // store word counts
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (word.isEmpty()) continue; // ignore empty words
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // print result
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
