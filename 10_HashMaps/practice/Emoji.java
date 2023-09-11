import java.util.HashMap;
public class Emoji {
    public static void main(String[] args) {
        String message = "I'm walking on sunshine";
        HashMap<String, String> emojis = new HashMap<String, String>();
        emojis.put("walking","🚶");
        emojis.put("sunshine", "☀️");
        System.out.println(emojis);

        String newMessage = "";
        for (String word : message.split(" ")) {
            if (emojis.containsKey(word)) {
                newMessage += emojis.get(word);
            } else {
                newMessage += word + " ";
            }
        }
        System.out.println(newMessage);

    }
}