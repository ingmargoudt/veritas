import org.junit.jupiter.api.Test;

import static io.github.ingmargoudt.veritas.Veritas.assertThat;

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
    public void hasDoubleValue(){
        Byte b = new Byte("10");
        assertThat(b).hasValue(10.0);
    }


    @Test
    public void hasFloatValue(){
        Byte b = new Byte("10");
        assertThat(b).hasValue(10.0f);
    }

    @Test
    public void hasShortValue(){
        Byte b = new Byte("10");
        short v = 10;
        assertThat(b).hasValue(v);
    }

    @Test
    public void hasLongValue(){
        Byte b = new Byte("10");
        assertThat(b).hasValue(10L);
    }
}
