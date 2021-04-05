import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static io.github.ingmargoudt.veritas.Veritas.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IterableAssertionTest {

    @Test
    public void hasNext(){
        Iterable<String> iterable = Arrays.asList("a","b");
        assertThat(iterable).isNotEmpty();
    }

    @Test
    public void notHasNext(){
        Iterable<String> iterable = Arrays.asList("a","b");
        assertThrows(AssertionError.class, () -> assertThat(iterable).isEmpty());
    }

    @Test
    public void hasNotNext(){
        Iterable<String> iterable = new ArrayList<>();
        assertThat(iterable).isEmpty();
    }
}
