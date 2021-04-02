import org.junit.jupiter.api.Test;

import static io.github.ingmargoudt.veritas.Veritas.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ByteAssertionTest {

    @Test
    public void isEqualTo(){
        Byte b = new Byte("10");
        Byte c = new Byte("10");
        assertThat(b).isEqualTo(c);
    }

    @Test
    public void hasIntValue(){
        Byte b  = new Byte("10");
        assertThat(b).hasValue(10);
    }

    @Test
    public void hasNotIntValue(){
        Byte b  = new Byte("10");
        assertThrows(AssertionError.class, () -> assertThat(b).hasValue(9));
    }

    @Test
    public void hasDoubleValue(){
        Byte b = new Byte("10");
        assertThat(b).hasValue(10.0);
    }

    @Test
    public void hasNotDoubleValue(){
        Byte b  = new Byte("10");
        assertThrows(AssertionError.class, () -> assertThat(b).hasValue(9.0));
    }


    @Test
    public void hasFloatValue(){
        Byte b = new Byte("10");
        assertThat(b).hasValue(10.0f);
    }

    @Test
    public void hasNotFloatValue(){
        Byte b = new Byte("10");
        assertThrows(AssertionError.class, () -> assertThat(b).hasValue(9.0f));
    }

    @Test
    public void hasShortValue(){
        Byte b = new Byte("10");
        short v = 10;
        assertThat(b).hasValue(v);
    }

    @Test
    public void hasNotShortValue(){
        Byte b = new Byte("10");
        short v = 9;
        assertThrows(AssertionError.class, () -> assertThat(b).hasValue(v));
    }

    @Test
    public void hasLongValue(){
        Byte b = new Byte("10");
        assertThat(b).hasValue(10L);
    }

    @Test
    public void hasNotLongValue(){
        Byte b = new Byte("10");
       assertThrows(AssertionError.class, () -> assertThat(b).hasValue(8L));
    }
}
