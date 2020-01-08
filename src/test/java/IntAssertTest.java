import org.junit.jupiter.api.Test;

import static io.github.ingmargoudt.veritas.Veritas.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IntAssertTest {

    private final Integer nullInteger = null;


    /*
    Tests for IntegerAssertion.isEven
     */
    @Test
    public void Integer_isEven() {
        assertThat(2).isEven();
    }

    @Test
    public void Integer_isEvenActualNull() {
        assertThrows(AssertionError.class, () -> assertThat(nullInteger).isEven());
    }

    @Test
    public void Integer_isNotEven() {
        assertThrows(AssertionError.class, () -> assertThat(3).isEven());
    }

    /*
    Tests for IntegerAssertion.isOdd
     */

    @Test
    public void Integer_isOdd() {
        assertThat(3).isOdd();
    }

    @Test
    public void Integer_isOddActualNull() {
        assertThrows(AssertionError.class, () -> assertThat(nullInteger).isOdd());
    }

    @Test
    public void Integer_isNotOdd() {
        assertThrows(AssertionError.class, () -> assertThat(4).isOdd());
    }

     /*
    Tests for IntegerAssertion.isSmallerThan()
     */

    @Test
    public void isSmallerThan() {
        assertThat(3).isSmallerThan(4);
    }

    @Test
    public void isNotSmallerThan() {
        assertThrows(AssertionError.class, () -> assertThat(3).isSmallerThan(2));
    }

    @Test
    public void isSmallerThanActualNull() {
        assertThrows(AssertionError.class, () -> assertThat(nullInteger).isSmallerThan(10));
    }

    @Test
    public void isSmallerThanNull() {
        assertThrows(NullPointerException.class, () -> assertThat(10).isSmallerThan(nullInteger));
    }

     /*
    Tests for IntegerAssertion.isSmallerThanorEqualTo
     */

    @Test
    public void isSmallerEqualTo() {
        assertThat(3).isSmallerThanOrEqual(3);
        assertThat(3).isSmallerThanOrEqual(4);
    }

    @Test
    public void isNotSmallerEqualTo() {
        assertThrows(AssertionError.class, () -> assertThat(4).isSmallerThanOrEqual(3));
    }

    @Test
    public void isSmallerThanEqualToActualNull() {
        assertThrows(AssertionError.class, () -> assertThat(nullInteger).isSmallerThanOrEqual(10));
    }

    @Test
    public void isSmallerThanEqualToNull() {
        assertThrows(NullPointerException.class, () -> assertThat(10).isSmallerThanOrEqual(nullInteger));
    }

     /*
    Tests for IntegerAssertion.isGreaterThan
     */

    @Test
    public void isGreaterThan() {
        assertThat(4).isGreaterThan(3);
    }

    @Test
    public void isNotGreaterThan() {
        assertThrows(AssertionError.class, () -> assertThat(4).isGreaterThan(4));
    }

    @Test
    public void isGreaterThanActualNull() {
        assertThrows(AssertionError.class, () -> assertThat(nullInteger).isGreaterThan(3));
    }


    @Test
    public void isGreaterThanNull() {
        assertThrows(NullPointerException.class, () -> assertThat(3).isGreaterThan(nullInteger));
    }

     /*
    Tests for IntegerAssertion.isGreaterThanEqualTo
     */


    @Test
    public void isGreaterThanEqualTo() {
        assertThat(4).isGreaterThanOrEqual(4);
        assertThat(5).isGreaterThanOrEqual(4);
    }

    @Test
    public void isNotGreaterOrEqualTo() {
        assertThrows(AssertionError.class, () -> assertThat(3).isGreaterThanOrEqual(4));
    }

    @Test
    public void isGreaterThanEqualToNullActual(){
        assertThrows(AssertionError.class, () -> assertThat(nullInteger).isGreaterThanOrEqual(5));
    }

    @Test
    public void isGreaterThanEqualToNull(){
        assertThrows(NullPointerException.class, () -> assertThat(3).isGreaterThanOrEqual(nullInteger));
    }

     /*
    Tests for IntegerAssertion.isBetween
     */

    @Test
    public void isBetween() {
        assertThat(4).isBetween(3, 5);
    }

    @Test
    public void isNotBetweenLow() {
        assertThrows(AssertionError.class, () -> assertThat(3).isBetween(4, 5));
    }

    @Test
    public void isNotBetweenHigh() {
        assertThrows(AssertionError.class, () -> assertThat(6).isBetween(4, 5));
    }


    @Test
    public void testInBetweenActualNull() {
        assertThrows(AssertionError.class, () -> assertThat(nullInteger).isBetween(1, 10));
    }

    @Test
    public void testInBetweenLowerNull() {
        assertThrows(NullPointerException.class, () -> assertThat(1).isBetween(nullInteger, 10));
    }

    @Test
    public void testInBetweenUpperNull() {
        assertThrows(NullPointerException.class, () -> assertThat(2).isBetween(1, nullInteger));
    }


     /*
    Tests for IntegerAssertion.isMultipleOf
     */

    @Test
    public void isMultipleOf() {
        assertThat(15).isMultipleOf(3);
    }

    @Test
    public void isNotMultipleOf() {
        assertThrows(AssertionError.class, () -> assertThat(15).isMultipleOf(4));
    }


    @Test
    public void testNullMultipleOf() {
        assertThrows(NullPointerException.class, () -> assertThat(15).isMultipleOf(nullInteger));
    }

    @Test
    public void testMultipleOfActualNull() {
        assertThrows(AssertionError.class, () -> assertThat(nullInteger).isMultipleOf(10));
    }

}
