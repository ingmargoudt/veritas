import org.junit.jupiter.api.Test;

import static io.github.ingmargoudt.veritas.Veritas.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EnumAssertionTest {

    enum orientation {
        NORTH,
        SOUTH,
        WEST,
        EAST
    }

    @Test
    public void testEquality(){
        assertThat(orientation.NORTH).isEqualTo(orientation.NORTH);
    }


    @Test
    public void testInEquality(){
       assertThrows(AssertionError.class, () -> assertThat(orientation.NORTH).isEqualTo(orientation.SOUTH));
    }
}
