import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.github.ingmargoudt.veritas.Veritas.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MapAssertionTest {

    private final Map nullMap = new HashMap<>();

    @Test
    public void containsKey(){
        Map<String, Integer> theMap = new HashMap<>();
        theMap.put("A",1);
        String key = "A";
        assertThat(theMap).containsKey(key);
    }

    @Test
    public void notContainsKey(){
        Map<String, Integer> theMap = new HashMap<>();
        theMap.put("A",1);
        String key = "B";
        assertThrows(AssertionError.class, () ->assertThat(theMap).containsKey(key));
    }
}
