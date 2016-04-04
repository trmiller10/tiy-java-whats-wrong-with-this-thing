import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LowClassTest extends OutputTest {

    @Test
    public void testOutput(){
        LowClass.main(null);

        assertThat(outputStream.toString(), is("BEEEEEEEELllllllllchhhhHHHH!!!\n"));
    }
}