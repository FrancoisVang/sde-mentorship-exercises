import java.util.HashMap; //Hashmap import used to create a map that can store word counts

import java.util.Map; // Map import used for key, value pair e.g. String, Integer

public class WordFrequencyCounter {

    //starting method that takes a string "myInput" and returns a map where the key = String and value = integer
    //key = the word
    //value = how many times the word appears
    public Map<String, Integer> countWords(String myInput) {

        //creates an empty hashmap e.g. JAVA, java, AWS = java > 2, aws > 1
        Map<String, Integer> wordCounts = new HashMap<>();

        //checks input to see if is null or empty e.g. "" is empty
        if (myInput == null || myInput.isBlank()) {

            //return: stops the method and returns the value to where its been called
            //checks if myInput is null or isEmpty will return an empty map created at line 13
            return wordCounts;

        }

        //converts cases to lowercase so that all input is treated equally.
        String ignoreCases = myInput.toLowerCase();

        //if ignorecases have punctuations this will ensure it gets removed
        //source: https://www.baeldung.com/java-remove-punctuation-from-string
        String ignorePunct = ignoreCases.replaceAll("\\p{Punct}", " ");

        //splitting input using split() with the delimnater " "
        //Using String[] to support the String split
        //trim(): used for removing spaces from the beginning and end
        //split("\\s+"): used when there is more than one space
        //source: https://codegym.cc/groups/posts/stringsplit-method-in-java | https://codegym.cc/groups/posts/java-string-trim-method
        String[] cleanWords = ignorePunct.trim().split("\\s+");

        //for loop to count the words: https://www.w3schools.com/java/java_for_loop.asp
        for(int i = 0; i < cleanWords.length; i++) {

            //currentWord will be stored temp until the next loop
            String currentWord = cleanWords[i];

            if(wordCounts.containsKey(currentWord)) {
                
                //grabs the current count stored in the map
                int currentCount = wordCounts.get(currentWord);

                //word already exists, grab current count and increase it by 1.
                wordCounts.put(currentWord, currentCount + 1);
            } else {
                // first time seeing this word place it in the map with a count of 1.
                wordCounts.put(currentWord, 1);
                System.out.println("word added: " + currentWord);
            }
        }


        return wordCounts;

    }

public static void main(String[] args) {
    WordFrequencyCounter counter = new WordFrequencyCounter();

    System.out.println(counter.countWords("Java java, AWS!"));
}
}