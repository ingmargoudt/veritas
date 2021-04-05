import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

import static io.github.ingmargoudt.veritas.Veritas.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IteratorAssertionTest {

    @Test
    public void hasNext(){
        Iterator<String> iterator = Arrays.asList("a","b").iterator();
        assertThat(iterator).hasNext();
    }

    @Test
    public void notHasNext(){
        Iterator<String> iterator = Arrays.asList("a","b").iterator();
        assertThrows(AssertionError.class, () -> assertThat(iterator).isEmpty());
    }

    @Test
    public void hasNotNext(){
        Iterator<String> iterator = Collections.emptyIterator();
        assertThat(iterator).isEmpty();
    }
}
