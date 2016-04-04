import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ChargeTest extends OutputTest {

    @Test
    public void testOutput(){
        Charge.main(null);

        assertThat(outputStream.toString(), is("Is my hair standing on end? true\n"));
    }
}
