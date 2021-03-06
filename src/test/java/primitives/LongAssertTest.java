package primitives;

import org.junit.jupiter.api.Test;

import static io.github.ingmargoudt.veritas.Veritas.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LongAssertTest {

    private final Long nullLong = null;
    private final Integer nullInt = null;


    /*
    Tests for LongAssertion.isEven
     */
    @Test
    public void Long_isEven() {
        assertThat(2L).isEven();
    }

    @Test
    public void Long_isEvenActualNull() {
        assertThrows(AssertionError.class, () -> assertThat(nullLong).isEven());
    }

    @Test
    public void Long_isNotEven() {
        assertThrows(AssertionError.class, () -> assertThat(3L).isEven());
    }

    /*
    Tests for LongAssertion.isOdd
     */

    @Test
    public void Long_isOdd() {
        assertThat(3L).isOdd();
    }

    @Test
    public void Long_isOddActualNull() {
        assertThrows(AssertionError.class, () -> assertThat(nullLong).isOdd());
    }

    @Test
    public void Long_isNotOdd() {
        assertThrows(AssertionError.class, () -> assertThat(4L).isOdd());
    }

     /*
    Tests for LongAssertion.isSmallerThan()
     */

    @Test
    public void isSmallerThan() {
        assertThat(3L).isSmallerThan(4L);
    }

    @Test
    public void isNotSmallerThan() {
        assertThrows(AssertionError.class, () -> assertThat(3L).isSmallerThan(2L));
    }

    @Test
    public void isSmallerThanActualNull() {
        assertThrows(AssertionError.class, () -> assertThat(nullLong).isSmallerThan(10L));
    }

    @Test
    public void isSmallerThanNull() {
        assertThrows(NullPointerException.class, () -> assertThat(10L).isSmallerThan(nullLong));
    }

     /*
    Tests for LongAssertion.isSmallerThanorEqualTo
     */

    @Test
    public void isSmallerEqualTo() {
        assertThat(3L).isSmallerThanOrEqual(3L);
        assertThat(3L).isSmallerThanOrEqual(4L);
    }

    @Test
    public void isNotSmallerEqualTo() {
        assertThrows(AssertionError.class, () -> assertThat(4L).isSmallerThanOrEqual(3L));
    }

    @Test
    public void isSmallerThanEqualToActualNull() {
        assertThrows(AssertionError.class, () -> assertThat(nullLong).isSmallerThanOrEqual(10L));
    }

    @Test
    public void isSmallerThanEqualToNull() {
        assertThrows(NullPointerException.class, () -> assertThat(10L).isSmallerThanOrEqual(nullLong));
    }

     /*
    Tests for LongAssertion.isGreaterThan
     */

    @Test
    public void isGreaterThan() {
        assertThat(4L).isGreaterThan(3L);
    }

    @Test
    public void isNotGreaterThan() {
        assertThrows(AssertionError.class, () -> assertThat(4L).isGreaterThan(4L));
    }

    @Test
    public void isGreaterThanActualNull() {
        assertThrows(AssertionError.class, () -> assertThat(nullLong).isGreaterThan(3L));
    }


    @Test
    public void isGreaterThanNull() {
        assertThrows(NullPointerException.class, () -> assertThat(3L).isGreaterThan(nullLong));
    }

     /*
    Tests for LongAssertion.isGreaterThanEqualTo
     */


    @Test
    public void isGreaterThanEqualTo() {
        assertThat(4L).isGreaterThanOrEqual(4L);
        assertThat(5L).isGreaterThanOrEqual(4L);
    }

    @Test
    public void isNotGreaterOrEqualTo() {
        assertThrows(AssertionError.class, () -> assertThat(3L).isGreaterThanOrEqual(4L));
    }

    @Test
    public void isGreaterThanEqualToNullActual(){
        assertThrows(AssertionError.class, () -> assertThat(nullLong).isGreaterThanOrEqual(5L));
    }

    @Test
    public void isGreaterThanEqualToNull(){
        assertThrows(NullPointerException.class, () -> assertThat(3L).isGreaterThanOrEqual(nullLong));
    }

     /*
    Tests for LongAssertion.isBetween
     */

    @Test
    public void isBetween() {
        assertThat(4L).isBetween(3L, 5L);
    }

    @Test
    public void isNotBetweenLow() {
        assertThrows(AssertionError.class, () -> assertThat(3L).isBetween(4L, 5L));
    }

    @Test
    public void isNotBetweenHigh() {
        assertThrows(AssertionError.class, () -> assertThat(6L).isBetween(4L, 5L));
    }



    @Test
    public void testInBetweenActualNull() {
        assertThrows(AssertionError.class, () -> assertThat(nullLong).isBetween(1L, 10L));
    }

    @Test
    public void testInBetweenLowerNull() {
        assertThrows(NullPointerException.class, () -> assertThat(1L).isBetween(nullLong, 10L));
    }

    @Test
    public void testInBetweenUpperNull() {
        assertThrows(NullPointerException.class, () -> assertThat(2L).isBetween(1L, nullLong));
    }

     /*
    Tests for LongAssertion.isMultipleOf
     */

    @Test
    public void isMultipleOf() {
        assertThat(15L).isMultipleOf(3);
    }

    @Test
    public void isNotMultipleOf() {
        assertThrows(AssertionError.class, () -> assertThat(15L).isMultipleOf(4));
    }


    @Test
    public void testNullMultipleOf() {
        assertThrows(NullPointerException.class, () -> assertThat(15L).isMultipleOf(nullInt));
    }

    @Test
    public void testMultipleOfActualNull() {
        assertThrows(AssertionError.class, () -> assertThat(nullLong).isMultipleOf(10));
    }

    @Test
    public void isPositive(){
        long y = 2L;
        assertThat(y).isPositive();
    }

    @Test
    public void zeroIsNotPositive() {
        assertThrows(AssertionError.class, () -> assertThat(0L).isPositive());
    }

    @Test
    public void notIsPositive(){
        long y = -2L;
        assertThrows(AssertionError.class, () -> assertThat(y).isPositive());
    }

}
