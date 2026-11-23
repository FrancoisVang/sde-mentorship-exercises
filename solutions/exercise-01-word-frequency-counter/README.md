# Exercise 01: Word Frequency Counter
## My Approach

Explain the steps your program follows.

1. First, I imported map then created a map function "countWords" that took a a string input.
2. Next, I created a new hashmap that took String, Integer as params, added a string that would convert all words to lowercase as well as remove all punctuations, and an array to remove extra white space and separate the words e.g. "Java java AWS" = cleanWords[0] = Java, cleanWords[1] = java, cleanWords[2] = AWS.
3. After that, I used a simple for loop to check if the word exist and if it does grab it's current count and increase it by 1 else it would add the word to the hashmap and give it a starting count at 1.
4. Finally, I returned the amount of words counted after running the word through the if statement, ignorecases, ignorepunct, cleanWords, and for loop.



## Code Explanation

**1. Input Handling**

The program checks against null or blank hashmap inputs.

**2. Text Normalization**

THe program will force lowercase with the toLowerCase(); function.

**3. HashMap**

Used a hashmap because it contains a String that is used to check if the word exist and integer to use a word frequency counter.

**4. Loops and Conditions**

THe program uses a generic for loop to loop through the "cleanWords" that undergone several checks to make the params predictable and beginnings looping through the cleanWords array's length. Since no String, Integers have been hardcoded into the program every word fed will be unique at first and the loop will place the word into the hashmap as well as begin the count at 1. If the word exist, it will grab it's current integer and increase it by 1.

**5. Returning the Result**

The method returns the word = count. For example, "Amazon AMAZON AmAzOn!        " will return {Amazon=3}

## Design Decisions

HashMap: I used a hashmap because the String represents the word and integer, how many times it appears.
Text normalization: Kept it simple by having all words be lowercase so words appear consistently.
Null | Empty Handle: the if statement checks for null or isblank inputs and the test will use assertTrue result.isEmpty() to check if the map is returning a blank.

## Edge Cases

- Null input & Empty input: if the map returns empty or null, the test will fail if you use assertEquals, on the other hand will pass if using assertTrue
- Uppercase and lowercase words: Utilizing the built in string function toLowerCase() will convert all casses to lowercase ensuring one word type.
- Punctuation: The string method .replaceAll() paired with \\p{Punct} was used for all regex characters and if true replace it with an empty white space.
- Repeated words: Repeated words will be stored into the hashmap and each cycle will increase the count by 1 or if the word does not exist it will add the word and begin the count at 1 which could increase if the word comes up again.

## Unit Testing

For test 1, I tested if the words get counted
In test 2, I gave the input of "Hello HELLO hello" expecting it to show up 3 times and output "hello". The purpose was to test if the words contained the same capitalizations as a result the test passed.

For test 2, check if it program will treat the capitalizations the same. Inputted the same word with different cap sizes and resulted in the same word occuring 3 times.

Test 3, the purpose was to return an empty map, the way to achieve that was to use "" in the counter to check if it returns empty.

Test 4, checks if the input "!!!" will return an map containing no character and counts as not empty.


## Time Complexity & Space Complexity

My solution runs in O(n) time because it processes each word once, and uses
O(n) extra space because it creates an array to store the words and a Hashmap to track their occurrences.

