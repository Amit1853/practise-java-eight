package codewars;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReverseString {
    public static String revrseWords(String original) throws IOException {
        /*StringBuilder stringBuilder = new StringBuilder();
        StringReader reader = new StringReader(original);
        if(reader.ready()){
            int ch = reader.read();
            while(ch != -1){
                System.out.println((char)ch);
                ch = reader.read();
            }
        }*/
       /* String[] splitedString = original.split(" ");
        for (String str : splitedString) {

            char[] characters = str.toCharArray();
            stringBuilder.append(" ");
            for (int i = characters.length - 1; i >= 0; i--) {
                stringBuilder.append(characters[i]);
            }
        }*/

        for (int i = original.length() - 1; i >= 0; i--) {
            System.out.println(original.charAt(i));
            List<Character> chars = new ArrayList<>();
            chars.add(original.charAt(i));


        }
        return original;
    }

    public static void main(String[] args) throws IOException {

        String reversedWords = revrseWords("The quick brown fox jumps over the lazy dog.");
    }
}
