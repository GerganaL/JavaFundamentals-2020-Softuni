package AssociativeArrays;

import java.util.*;

public class wordSynonyms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> wordSynonyms = new LinkedHashMap<>();

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n ; i++) {
            String word = scan.nextLine();
            String synonym = scan.nextLine();

            ArrayList<String> currentSynonyms = wordSynonyms.get(word);
            if (currentSynonyms == null){
                currentSynonyms = new ArrayList<>();
                wordSynonyms.put(word, currentSynonyms);
            }
            currentSynonyms.add(synonym);
        }

        for (Map.Entry<String,ArrayList<String>>entry : wordSynonyms.entrySet()){
            System.out.println(entry.getKey() + " - " + String.join(", ",entry.getValue()));
        }
    }
}
