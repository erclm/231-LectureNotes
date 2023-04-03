import java.util.HashMap;
public class Emoji {
    public static void main(String[] args) {
        // create our hashmap that has the word as a key and emoji as a value
        HashMap<String, String> emojis = new HashMap<String, String>();
        String message = "I'm walking on sunshine";
        emojis.put("walking", "🚶");
        emojis.put("sunshine", "☀️");

        System.out.println(emojis);

        // break our message into an array of words
        // see if each word has a key in our hashmap
        // if so, we want to add that emoji to the message
        String newMessage = "";
        for (String word : message.split(" ")) {
            if (emojis.containsKey(word)) {
                newMessage += emojis.get(word) + " ";
            } else {
             newMessage += word + " ";
            }
        }
        System.out.println(newMessage);
    }
}