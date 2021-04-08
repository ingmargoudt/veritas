package math;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static io.github.ingmargoudt.veritas.Veritas.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BigDecimalTest {

    @Test
    public void smallerThan(){
        BigDecimal b1 = new BigDecimal("300000000000000.01");
        BigDecimal b2 = new BigDecimal("300000000000000.1");
        assertThat(b1).isSmallerThan(b2);
    }

    @Test
    public void notSmallerThan(){
        BigDecimal b1 = new BigDecimal("300000000000000.01");
        BigDecimal b2 = new BigDecimal("300000000000000.1");
        assertThrows(AssertionError.class, () ->assertThat(b2).isSmallerThan(b1));
    }

    @Test
    public void smallerThanOrEqual(){
        BigDecimal b1 = new BigDecimal("300000000000000.01");
        BigDecimal b2 = new BigDecimal("300000000000000.1");
        assertThat(b1).isSmallerThanOrEqual(b2);
        assertThat(b1).isSmallerThanOrEqual(b1);
    }

    @Test
    public void notSmallerThanOrEqual(){
        BigDecimal b1 = new BigDecimal("300000000000000.01");
        BigDecimal b2 = new BigDecimal("300000000000000.1");
        assertThrows(AssertionError.class, () ->assertThat(b2).isSmallerThanOrEqual(b1));
    }

    @Test
    public void greaterThan(){
        BigDecimal b1 = new BigDecimal("300000000000000.01");
        BigDecimal b2 = new BigDecimal("300000000000000.1");
        assertThat(b2).isGreaterThan(b1);
    }

    @Test
    public void notgreaterThan(){
        BigDecimal b1 = new BigDecimal("300000000000000.01");
        BigDecimal b2 = new BigDecimal("300000000000000.1");
        assertThrows(AssertionError.class, () ->assertThat(b1).isGreaterThan(b2));
    }

    @Test
    public void greaterThanOrEqual(){
        BigDecimal b1 = new BigDecimal("300000000000000.01");
        BigDecimal b2 = new BigDecimal("300000000000000.1");
        assertThat(b2).isGreaterThanOrEqual(b1);
        assertThat(b2).isGreaterThanOrEqual(b2);
    }

    @Test
    public void notGreatrThanOrEqual(){
        BigDecimal b1 = new BigDecimal("300000000000000.01");
        BigDecimal b2 = new BigDecimal("300000000000000.1");
        assertThrows(AssertionError.class, () ->assertThat(b1).isGreaterThanOrEqual(b2));
    }

    @Test
    public void isBetween(){

        BigDecimal b1 = new BigDecimal("300000000000000.05");
        BigDecimal b2 = new BigDecimal("300000000000000.1");
        BigDecimal b3 = new BigDecimal("300000000000000.2");
        assertThat(b2).isBetween(b1, b3);
    }


    @Test
    public void isNotBetweenLower(){

        BigDecimal b1 = new BigDecimal("300000000000000.05");
        BigDecimal b2 = new BigDecimal("300000000000000.1");
        BigDecimal b3 = new BigDecimal("300000000000000.3");
        assertThrows(AssertionError.class, () -> assertThat(b1).isBetween(b2, b3));
    }


    @Test
    public void isNotBetweenUpper(){

        BigDecimal b1 = new BigDecimal("300000000000000.05");
        BigDecimal b2 = new BigDecimal("300000000000000.2");
        BigDecimal b3 = new BigDecimal("300000000000000.3");
        assertThrows(AssertionError.class, () -> assertThat(b3).isBetween(b1, b2));
    }

    @Test
    public void isPositive(){
        BigDecimal positiveBigDecimal = new BigDecimal("300000000000000.05");
        assertThat(positiveBigDecimal).isPositive();
    }

    @Test
    public void zeroIsNotPositive(){
        BigDecimal positiveBigDecimal = new BigDecimal("0.0");
        assertThrows(AssertionError.class, () -> assertThat(positiveBigDecimal).isPositive());
    }

    @Test
    public void notIsPositive(){
        BigDecimal positiveBigDecimal = new BigDecimal("-300000000000000.01");
        assertThrows(AssertionError.class, () -> assertThat(positiveBigDecimal).isPositive());
    }
}
