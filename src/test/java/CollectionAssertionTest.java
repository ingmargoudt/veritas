import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static io.github.ingmargoudt.veritas.Veritas.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CollectionAssertionTest {

    @Test
    public void testEquals(){
        List<String> actual = new ArrayList<>();
        actual.add("A");

        List<String> expected = new ArrayList<>();
        expected.add("A");

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testNotEquals(){
        List<String> actual = new ArrayList<>();
        actual.add("A");

        List<String> expected = new ArrayList<>();
        expected.add("B");

        assertThat(actual).isNotEqualTo(expected);
    }

    @Test
    public void testContains(){
        List<String> actual = new ArrayList<>();
        actual.add("A");
        actual.add("B");

        assertThat(actual).contains("A");
    }

    @Test
    public void testSize(){
        Collection<String> actual = new ArrayList<>();
        actual.add("A");
        actual.add("B");

        assertThat(actual).hasSize(2);
    }

    @Test
    public void testNotSize(){
        Collection<String> actual = new ArrayList<>();
        actual.add("A");
        actual.add("B");

        assertThrows(AssertionError.class, () ->assertThat(actual).hasSize(3));
    }

    @Test
    public void testIsEmpty(){
        Collection<String> actual = new ArrayList<>();

        assertThat(actual).isEmpty();
    }
}
