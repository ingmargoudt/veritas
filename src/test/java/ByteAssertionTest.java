import org.junit.jupiter.api.Test;

import static io.github.ingmargoudt.veritas.Veritas.assertThat;

public class ByteAssertionTest {

    @Test
    public void isEqualTo(){
        Byte b = new Byte("10");
        Byte c = new Byte("10");
        assertThat(b).isEqualTo(c);
    }
}
