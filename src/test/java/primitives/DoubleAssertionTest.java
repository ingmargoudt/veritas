package primitives;

import org.junit.jupiter.api.Test;

import static io.github.ingmargoudt.veritas.Veritas.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DoubleAssertionTest {

    @Test
    public void smallerThan(){
        assertThat(4.001).isSmallerThan(4.01);
    }

    @Test
    public void notmallerThan(){
        assertThrows(AssertionError.class, () -> assertThat(4.01).isSmallerThan(4.001));
    }

    @Test
    public void smallerThanEqual(){
        assertThat(4.01).isSmallerThanOrEqual(4.02);
        assertThat(4.01).isSmallerThanOrEqual(4.01);
    }

    @Test
    public void notSmallerThanEqual(){
        assertThrows(AssertionError.class, () -> assertThat(4.03).isSmallerThanOrEqual(4.02));
    }

    @Test
    public void greaterThan(){
        assertThat(0.8).isGreaterThan(0.7);
    }

    @Test
    public void notGreaterThan(){
        assertThrows(AssertionError.class, () -> assertThat(0.8).isGreaterThan(0.8));
    }

    @Test
    public void greaterThanEqual(){
        assertThat(4.02).isGreaterThanOrEqual(4.01);
        assertThat(4.02).isGreaterThanOrEqual(4.02);
    }


    @Test
    public void notGreaterThanOrEquals(){
        assertThrows(AssertionError.class, () -> assertThat(0.7).isGreaterThanOrEqual(0.71));
    }

    @Test
    public void inBetween(){
        assertThat(4.02).isBetween(4.01, 4.03);
    }

    @Test
    public void isNotBetweenLow() {
        assertThrows(AssertionError.class, () -> assertThat(4.01).isBetween(4.02, 4.03));
    }

    @Test
    public void isNotBetweenHigh() {
        assertThrows(AssertionError.class, () -> assertThat(4.03).isBetween(4.01, 4.02));
    }

    @Test
    public void isPositive(){
        double y = 2.0;
        assertThat(y).isPositive();
    }

    @Test
    public void notIsPositive(){
        double y = -2.0;
        assertThrows(AssertionError.class, () -> assertThat(y).isPositive());
    }


}
