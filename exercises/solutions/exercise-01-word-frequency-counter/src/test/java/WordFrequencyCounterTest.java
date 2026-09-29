import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.Map;

public class WordFrequencyCounterTest {

    @Test
    void countsWordsAndNormalizeCase() {

        // Arrange
        WordFrequencyCounter counter = new WordFrequencyCounter();

        // Act
        Map<String, Integer> result = counter.countWords("Java java, AWS! Java JAVA JAVa");
        

        System.out.println("Result: " + result);

        // Assert
        assertEquals(5, result.get("java"));
        assertEquals(1, result.get("aws"));
    }
    @Test
    void countsWordsRemovePunctuations() {

        // Arrange
        WordFrequencyCounter counter = new WordFrequencyCounter();

        // Act
        Map<String, Integer> result = counter.countWords("Java., AWS! : JAVA ; JAVa");
        

        System.out.println("Result: " + result);

        // Assert
        assertEquals(3, result.get("java"));
        assertEquals(1, result.get("aws"));
    }
    @Test
    void countsWordsAndSplitWords() {

        // Arrange
        WordFrequencyCounter counter = new WordFrequencyCounter();

        // Act
        Map<String, Integer> result = counter.countWords("Java AWS JAVA     JAVa");
        

        System.out.println("Result: " + result);

        // Assert
        assertEquals(3, result.get("java"));
        assertEquals(1, result.get("aws"));
    }
}
