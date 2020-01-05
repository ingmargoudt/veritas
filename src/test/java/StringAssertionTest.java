import org.junit.jupiter.api.Test;

import static io.github.ingmargoudt.veritas.Veritas.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringAssertionTest {

    private final String nullString = null;

    @Test
    public void emptyString(){
        assertThat("").isEmpty();
    }

    @Test
    public void notEmptyString(){
        assertThrows(AssertionError.class, () -> assertThat("foo").isEmpty());
    }

    @Test
    public void nullIsNotEmpty(){
        assertThrows(AssertionError.class, () -> assertThat(nullString).isEmpty());
    }

    @Test
    public void startsWith(){
        assertThat("foo").startsWith("fo");
    }

    @Test
    public void notStartsWith(){
        assertThrows(AssertionError.class, () -> assertThat("foo").startsWith("bar"));
    }


    @Test
    public void endsWith(){
        assertThat("foo").endsWith("oo");
    }

    @Test
    public void contains() {
        assertThat("foobar").contains("oba");
    }

    @Test
    public void equalsIgnoreCase(){
        assertThat("foo").equalsIgnoreCase("FOO");
    }
}
