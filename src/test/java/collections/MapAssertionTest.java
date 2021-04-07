package collections;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.github.ingmargoudt.veritas.Veritas.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MapAssertionTest {

    @Test
    public void containsKey() {
        Map<String, Integer> theMap = new HashMap<>();
        theMap.put("A", 1);
        String key = "A";
        assertThat(theMap).containsKey(key);
    }

    @Test
    public void notContainsKey() {
        Map<String, Integer> theMap = new HashMap<>();
        theMap.put("A", 1);
        String key = "B";
        assertThrows(AssertionError.class, () -> assertThat(theMap).containsKey(key));
    }

    @Test
    public void isEmpty() {
        Map<String, String> theMap = new HashMap<>();
        assertThat(theMap).isEmpty();
    }


    @Test
    public void isNotEmpty() {
        Map<String, String> theMap = new HashMap<>();
        theMap.put("A", "A");
        assertThrows(AssertionError.class, () -> assertThat(theMap).isEmpty());
    }

    @Test
    public void containsValue() {
        Map<String, Integer> theMap = new HashMap<>();
        theMap.put("A", 1);
        int value = 1;
        assertThat(theMap).containsValue(value);
    }

    @Test
    public void notContainsValue() {
        Map<String, Integer> theMap = new HashMap<>();
        theMap.put("A", 1);
        Integer value = 2;
        assertThrows(AssertionError.class, () -> assertThat(theMap).containsValue(value));
    }
}
