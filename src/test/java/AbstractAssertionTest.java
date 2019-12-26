import io.github.ingmargoudt.veritas.Veritas;
import io.github.ingmargoudt.veritas.assertions.IntegerAssertion;
import org.junit.jupiter.api.Test;

import static io.github.ingmargoudt.veritas.Veritas.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AbstractAssertionTest {
    @Test
    public void isEqualTo() {
        assertThat(3).isEqualTo(3);
    }

    @Test
    public void notisEqualTo() {
        assertThrows(AssertionError.class, () -> assertThat(3).isNotEqualTo(3));
    }

    @Test
    public void isNotEqualTo() {
        assertThat(3).isNotEqualTo(5);
    }

    @Test
    public void not_equals() {
        assertThrows(AssertionError.class, () ->
        {
            assertThat(3).isEqualTo(4);
        });
    }

    @Test
    public void isNull(){
        assertThat(null).isNull();
    }

    @Test
    public void notIsNull(){
        assertThrows(AssertionError.class, () -> assertThat(3).isNull());
    }

    @Test
    public void isNotNull(){
        assertThat(3).isNotNull();
    }

    @Test
    public void notIsNotNull(){
        assertThrows(AssertionError.class, () -> assertThat(null).isNotNull());
    }


    @Test
    public void customMessage() {
        Veritas.LOG_PASSED = true;
        IntegerAssertion success = assertThat(3).onSucces("success");
        assertEquals("success", success.getCustomPassMessage());
        success.isEqualTo(3);
    }

    @Test
    public void customErrorMessage() {
        IntegerAssertion fail = assertThat(3).onFail("fail");
        assertEquals("fail", fail.getCustomErrorMessage());
        assertThrows(AssertionError.class, () -> fail.isEqualTo(4));
    }
}
