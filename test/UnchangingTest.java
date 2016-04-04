import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class UnchangingTest extends OutputTest {

    @Test
    public void testOutput(){
        Unchanging.main(null);

        assertThat(outputStream.toString(), is("The meaning of life is: 42\n"));
    }
}