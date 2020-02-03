import org.junit.jupiter.api.Test;

import java.util.Optional;

import static io.github.ingmargoudt.veritas.Veritas.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OptionalAssertionTest {


    @Test
    public void isPresent(){
        assertThat(Optional.of("abc")).isPresent();
    }

    @Test
    public void isNotPresent(){
        assertThrows( AssertionError.class, () -> assertThat(Optional.of("abc")).isEmpty());
    }

    @Test
    public void isEmpty(){
        assertThat(Optional.empty()).isEmpty();
    }

    @Test
    public void isNotEmpty(){
        assertThrows( AssertionError.class, () -> assertThat(Optional.of("abc")).isEmpty());
    }
}
