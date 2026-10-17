import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Map;

import org.junit.jupiter.api.Test;

public class WordFrequencyCounterTest {

    @Test
    void countsWordsFromExerciseE() {

        // Arrange
        WordFrequencyCounter counter = new WordFrequencyCounter();

        // Act
        Map<String, Integer> result = counter.countWords("Java java AWS");

        // Assert
        assertEquals(2, result.get("java"));
        assertEquals(1, result.get("aws"));
    }

    @Test
    void treatsCapitalizationTheSame() {

        // Arrange
        WordFrequencyCounter counter = new WordFrequencyCounter();

        // Act
        Map<String, Integer> result = counter.countWords("Hello HELLO hello");
        assertEquals(3, result.get("hello"));

    }

    @Test
    void returnsEmptyMapForBlankInput() {

        // Arrange
        WordFrequencyCounter counter = new WordFrequencyCounter();

        // Act
        Map<String, Integer> result = counter.countWords("");

        // Assert
        // How could you check whether result is empty?
        assertTrue(result.isEmpty());
    }

    @Test
    void handlesPunctuationOnlyInput() {

        WordFrequencyCounter counter = new WordFrequencyCounter();

        Map<String, Integer> result = counter.countWords("!!!");

        // Assert that the map should be empty
        assertEquals(1, result.get(""));
    }
}
