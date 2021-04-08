package math;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static io.github.ingmargoudt.veritas.Veritas.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BigIntegerTest {

    @Test
    public void smallerThan(){
        BigInteger b1 = new BigInteger("3000000000000000");
        BigInteger b2 = new BigInteger("3000000000000001");
        assertThat(b1).isSmallerThan(b2);
    }

    @Test
    public void notSmallerThan(){
        BigInteger b1 = new BigInteger("3000000000000000");
        BigInteger b2 = new BigInteger("3000000000000001");
        assertThrows(AssertionError.class, () ->assertThat(b2).isSmallerThan(b1));
    }

    @Test
    public void smallerThanOrEqual(){
        BigInteger b1 = new BigInteger("3000000000000000");
        BigInteger b2 = new BigInteger("3000000000000001");
        assertThat(b1).isSmallerThanOrEqual(b2);
        assertThat(b1).isSmallerThanOrEqual(b1);
    }

    @Test
    public void notSmallerThanOrEqual(){
        BigInteger b1 = new BigInteger("3000000000000000");
        BigInteger b2 = new BigInteger("3000000000000001");
        assertThrows(AssertionError.class, () ->assertThat(b2).isSmallerThanOrEqual(b1));
    }

    @Test
    public void greaterThan(){
        BigInteger b1 = new BigInteger("3000000000000000");
        BigInteger b2 = new BigInteger("3000000000000001");
        assertThat(b2).isGreaterThan(b1);
    }

    @Test
    public void notgreaterThan(){
        BigInteger b1 = new BigInteger("3000000000000000");
        BigInteger b2 = new BigInteger("3000000000000001");
        assertThrows(AssertionError.class, () ->assertThat(b1).isGreaterThan(b2));
    }

    @Test
    public void greaterThanOrEqual(){
        BigInteger b1 = new BigInteger("3000000000000000");
        BigInteger b2 = new BigInteger("3000000000000001");
        assertThat(b2).isGreaterThanOrEqual(b1);
        assertThat(b2).isGreaterThanOrEqual(b2);
    }

    @Test
    public void notGreatrThanOrEqual(){
        BigInteger b1 = new BigInteger("3000000000000000");
        BigInteger b2 = new BigInteger("3000000000000001");
        assertThrows(AssertionError.class, () ->assertThat(b1).isGreaterThanOrEqual(b2));
    }

    @Test
    public void isBetween(){

        BigInteger b1 = new BigInteger("3000000000000000");
        BigInteger b2 = new BigInteger("3000000000000001");
        BigInteger b3 = new BigInteger("3000000000000002");
        assertThat(b2).isBetween(b1, b3);
    }


    @Test
    public void isNotBetweenLower(){

        BigInteger b1 = new BigInteger("3000000000000000");
        BigInteger b2 = new BigInteger("3000000000000001");
        BigInteger b3 = new BigInteger("3000000000000003");
        assertThrows(AssertionError.class, () -> assertThat(b1).isBetween(b2, b3));
    }


    @Test
    public void isNotBetweenUpper(){

        BigInteger b1 = new BigInteger("3000000000000000");
        BigInteger b2 = new BigInteger("3000000000000002");
        BigInteger b3 = new BigInteger("3000000000000003");
        assertThrows(AssertionError.class, () -> assertThat(b3).isBetween(b1, b2));
    }

    @Test
    public void isPositive(){
        BigInteger positiveBigInteger = new BigInteger("10");
        assertThat(positiveBigInteger).isPositive();
    }

    @Test
    public void zeroIsNotPositive(){
        BigInteger positiveBigInteger = new BigInteger("0");
        assertThrows(AssertionError.class, () -> assertThat(positiveBigInteger).isPositive());
    }

    @Test
    public void notIsPositive(){
        BigInteger positiveBigInteger = new BigInteger("-110");
        assertThrows(AssertionError.class, () -> assertThat(positiveBigInteger).isPositive());
    }

    @Test
    public void isEven(){
        BigInteger positiveBigInteger = new BigInteger("10");
        assertThat(positiveBigInteger).isEven();
    }

    @Test
    public void zeroIsEven(){
        BigInteger zero = new BigInteger("0");
        assertThat(zero).isEven();
    }

    @Test
    public void notIsEven(){
        BigInteger oddBigInteger = new BigInteger("3");
        assertThrows(AssertionError.class, () -> assertThat(oddBigInteger).isEven());
    }

    @Test
    public void isOdd(){
        BigInteger oddBigInteger = new BigInteger("3");
        assertThat(oddBigInteger).isOdd();
    }


    @Test
    public void notIsOdd(){
        BigInteger evenBigInteger = new BigInteger("4");
        assertThrows(AssertionError.class, () -> assertThat(evenBigInteger).isOdd());
    }
}
