package primitives;

import org.junit.jupiter.api.Test;

import static io.github.ingmargoudt.veritas.Veritas.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ShortAssertTest {

    private final Short nullShort = null;
    private final Short three = (short) 3;
    private final Short four = (short) 4;


    /*
    Tests for ShortAssertion.isEven
     */
    @Test
    public void Short_isEven() {
        assertThat(four).isEven();
    }

    @Test
    public void Short_isEvenActualNull() {
        assertThrows(AssertionError.class, () -> assertThat(nullShort).isEven());
    }

    @Test
    public void Short_isNotEven() {
        assertThrows(AssertionError.class, () -> assertThat(three).isEven());
    }

    /*
    Tests for ShortAssertion.isOdd
     */

    @Test
    public void Short_isOdd() {
        assertThat(three).isOdd();
    }

    @Test
    public void Short_isOddActualNull() {
        assertThrows(AssertionError.class, () -> assertThat(nullShort).isOdd());
    }

    @Test
    public void Short_isNotOdd() {
        assertThrows(AssertionError.class, () -> assertThat(four).isOdd());
    }

     /*
    Tests for ShortAssertion.isSmallerThan()
     */

    @Test
    public void isSmallerThan() {
        assertThat(three).isSmallerThan(four);
    }

    @Test
    public void isNotSmallerThan() {
        assertThrows(AssertionError.class, () -> assertThat(four).isSmallerThan(three));
    }

    @Test
    public void isSmallerThanActualNull() {
        assertThrows(AssertionError.class, () -> assertThat(nullShort).isSmallerThan(four));
    }

    @Test
    public void isSmallerThanNull() {
        assertThrows(IllegalArgumentException.class, () -> assertThat(four).isSmallerThan(nullShort));
    }

     /*
    Tests for ShortAssertion.isSmallerThanorEqualTo
     */

    @Test
    public void isSmallerEqualTo() {
        assertThat(three).isSmallerThanOrEqual(three);
        assertThat(three).isSmallerThanOrEqual(four);
    }

    @Test
    public void isNotSmallerEqualTo() {
        assertThrows(AssertionError.class, () -> assertThat(four).isSmallerThanOrEqual(three));
    }

    @Test
    public void isSmallerThanEqualToActualNull() {
        assertThrows(AssertionError.class, () -> assertThat(nullShort).isSmallerThanOrEqual(four));
    }

    @Test
    public void isSmallerThanEqualToNull() {
        assertThrows(IllegalArgumentException.class, () -> assertThat(four).isSmallerThanOrEqual(nullShort));
    }

    @Test
    public void isGreaterThan() {
        assertThat(four).isGreaterThan(three);
    }

    @Test
    public void isNotGreaterThan() {
        assertThrows(AssertionError.class, () -> assertThat(four).isGreaterThan(four));
    }

    @Test
    public void isGreaterThanActualNull() {
        assertThrows(AssertionError.class, () -> assertThat(nullShort).isGreaterThan(three));
    }


    @Test
    public void isGreaterThanNull() {
        assertThrows(IllegalArgumentException.class, () -> assertThat(three).isGreaterThan(nullShort));
    }

    @Test
    public void isGreaterThanEqualTo() {
        assertThat(four).isGreaterThanOrEqual(four);
        assertThat((short)5).isGreaterThanOrEqual(four);
    }

    @Test
    public void isNotGreaterOrEqualTo() {
        assertThrows(AssertionError.class, () -> assertThat((short) 3).isGreaterThanOrEqual((short) four));
    }

    @Test
    public void isGreaterThanEqualToNullActual() {
        assertThrows(AssertionError.class, () -> assertThat(nullShort).isGreaterThanOrEqual((short) 5));
    }

    @Test
    public void isGreaterThanEqualToNull() {
        assertThrows(IllegalArgumentException.class, () -> assertThat((short) 3).isGreaterThanOrEqual(nullShort));
    }


    @Test
    public void isBetween() {
        assertThat(four).isBetween(three, (short) 5);
    }

    @Test
    public void isNotBetweenLow() {
        assertThrows(AssertionError.class, () -> assertThat(three).isBetween(four, (short) 5));
    }

    @Test
    public void isNotBetweenHigh() {
        assertThrows(AssertionError.class, () -> assertThat(6).isBetween(4, 5));
    }


    @Test
    public void testInBetweenActualNull() {
        assertThrows(AssertionError.class, () -> assertThat(nullShort).isBetween((short) 1, (short) 10));
    }

    @Test
    public void testInBetweenLowerNull() {
        assertThrows(IllegalArgumentException.class, () -> assertThat((short) 1).isBetween(nullShort, (short) 10));
    }

    @Test
    public void testInBetweenUpperNull() {
        assertThrows(IllegalArgumentException.class, () -> assertThat((short) 2).isBetween((short) 1, nullShort));
    }

    @Test
    public void isMultipleOf() {
        assertThat(15).isMultipleOf(3);
    }

    @Test
    public void isNotMultipleOf() {
        assertThrows(AssertionError.class, () -> assertThat((short)15).isMultipleOf(four));
    }


    @Test
    public void testNullMultipleOf() {
        assertThrows(IllegalArgumentException.class, () -> assertThat((short) 15).isMultipleOf(nullShort));
    }

    @Test
    public void testMultipleOfActualNull() {
        assertThrows(AssertionError.class, () -> assertThat(nullShort).isMultipleOf((short) 10));
    }

    @Test
    public void isPositive() {
        int y = (short) 2;
        assertThat(y).isPositive();
    }

    @Test
    public void zeroIsNotPositive() {
        assertThrows(AssertionError.class, () -> assertThat((short) 0).isPositive());
    }

    @Test
    public void notIsPositive() {
        int y = (short) -2;
        assertThrows(AssertionError.class, () -> assertThat(y).isPositive());
    }

}
