import io.github.ingmargoudt.veritas.Veritas;
import io.github.ingmargoudt.veritas.assertions.IntegerAssertion;
import org.junit.jupiter.api.Test;

import static io.github.ingmargoudt.veritas.Veritas.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AbstractAssertionTest {

    private final Integer nullInteger = null;

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
        assertThat(nullInteger).isNull();
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
        assertThrows(AssertionError.class, () -> assertThat(nullInteger).isNotNull());
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

    @Test
    public void isSameAs(){
        int a = 3;
        int b = a;
        assertThat(a).isSameAs(b);
    }

    @Test
    public void isNotSameAs(){
        int a = 3;
        int b = 4;
        assertThat(a).isNotSameAs(b);
    }

    @Test
    public void notIsSameAs(){
        int a = 3;
        int b = 4;
        assertThrows(AssertionError.class, () -> assertThat(a).isSameAs(b));
    }

    @Test
    public void notIsNotSameAs(){
        int a = 3;
        int b = a;
        assertThrows(AssertionError.class, () -> assertThat(a).isNotSameAs(b));
    }
}
