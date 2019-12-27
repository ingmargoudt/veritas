import org.junit.jupiter.api.Test;

import static io.github.ingmargoudt.veritas.Veritas.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BooleanAssertionTest {

    private final Boolean nullBoolean = null;

    @Test
    public void test_True_is_True() {
        assertThat(true).isTrue();
    }

    @Test
    public void test_True_is_not_False() {
        assertThrows(AssertionError.class, () -> assertThat(true).isFalse());
    }

    @Test
    public void test_False_is_False() {
        assertThat(false).isFalse();
    }

    @Test
    public void test_False_is_not_True() {
        assertThrows(AssertionError.class, () -> assertThat(false).isTrue());
    }

    @Test
    public void test_Null_is_not_True(){
        assertThrows(AssertionError.class, () -> assertThat(nullBoolean).isTrue());
    }

    @Test
    public void test_Null_is_not_False(){
        assertThrows(AssertionError.class, () -> assertThat(nullBoolean).isFalse());
    }

    @Test
    public void test_True_is_not_Null(){
        assertThat(true).isNotNull() ;
    }

    @Test
    public void test_False_is_not_null(){
        assertThat(false).isNotNull();
    }

    @Test
    public void test_true_equals_true(){
        assertThat(true).isEqualTo(true);
    }

    @Test
    public void test_False_is_not_equal_to_True(){
        assertThat(false).isNotEqualTo(true);
    }

}
