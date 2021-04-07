package primitives;

import org.junit.jupiter.api.Test;

import static io.github.ingmargoudt.veritas.Veritas.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CharAssertionTest {

    @Test
    public void testLowerCase(){
        assertThat('c').isLowerCase();
    }

    @Test
    public void testNumericNotLowerCase(){
        assertThrows(AssertionError.class, () -> assertThat('1').isLowerCase());
    }

    @Test
    public void testUpperCase(){
        assertThat('C').isUpperCase();
    }

    @Test
    public void testNumericNotUpperCase(){
        assertThrows(AssertionError.class, () -> assertThat('1').isUpperCase());
    }
}
