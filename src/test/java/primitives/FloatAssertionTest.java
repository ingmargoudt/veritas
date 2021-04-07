package primitives;

import org.junit.jupiter.api.Test;

import static io.github.ingmargoudt.veritas.Veritas.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FloatAssertionTest {


    @Test
    public void smallerThan(){
        assertThat(4.001F).isSmallerThan(4.01F);
    }

    @Test
    public void notmallerThan(){
        assertThrows(AssertionError.class, () -> assertThat(4.01f).isSmallerThan(4.001f));
    }

    @Test
    public void smallerThanEqual(){
        assertThat(4.01F).isSmallerThanOrEqual(4.02F);
        assertThat(4.01F).isSmallerThanOrEqual(4.01F);
    }

    @Test
    public void notSmallerThanEqual(){
        assertThrows(AssertionError.class, () -> assertThat(4.03F).isSmallerThanOrEqual(4.02F));
    }

    @Test
    public void greaterThan(){
        assertThat(0.8F).isGreaterThan(0.7F);
    }

    @Test
    public void notGreaterThan(){
        assertThrows(AssertionError.class, () -> assertThat(0.8F).isGreaterThan(0.8F));
    }

    @Test
    public void greaterThanEqual(){
        assertThat(4.02F).isGreaterThanOrEqual(4.01F);
        assertThat(4.02F).isGreaterThanOrEqual(4.02F);
    }


    @Test
    public void notGreaterThanOrEquals(){
        assertThrows(AssertionError.class, () -> assertThat(0.7F).isGreaterThanOrEqual(0.71F));
    }

    @Test
    public void inBetween(){
        assertThat(4.02F).isBetween(4.01F, 4.03F);
    }

    @Test
    public void isNotBetweenLow() {
        assertThrows(AssertionError.class, () -> assertThat(4.01F).isBetween(4.02F, 4.03F));
    }

    @Test
    public void isNotBetweenHigh() {
        assertThrows(AssertionError.class, () -> assertThat(4.03F).isBetween(4.01F, 4.02F));
    }

    @Test
    public void isPositive(){
        float y = 2.0f;
        assertThat(y).isPositive();
    }

    @Test
    public void zeroIsNotPositive() {
        assertThrows(AssertionError.class, () -> assertThat(0.0f).isPositive());
    }

    @Test
    public void notIsPositive(){
        float y = -2.0f;
        assertThrows(AssertionError.class, () -> assertThat(y).isPositive());
    }


}
