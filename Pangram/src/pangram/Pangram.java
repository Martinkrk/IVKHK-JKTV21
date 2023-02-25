package pangram;

import java.util.HashMap;

public class Pangram {
    public static void main(String[] args) {
        HashMap<Character, Integer> dict = new HashMap<>();

        String text = "The quick brown fox jumps over a lazy dog.";
        boolean pangram = true;

        for(char x = 'A'; x <= 'Z'; ++x){
            dict.put(x, 0);
        }
        for(int i = 0; i < text.length(); i++){
            char y = text.toUpperCase().charAt(i);
            if(dict.containsKey(y)){
                dict.put(y, dict.get(y) + 1);
            }
        }
        for(int i : dict.values()){
            if(i == 0) pangram = false;
        }

        System.out.println("Pangram? " + pangram);
    }
}
