import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ConundrumTest extends OutputTest {

    @Test
    public void testOutput(){
        Conundrum.main(null);

        assertThat(outputStream.toString(), is("This is truly a humdrum conundrum!\n"));
    }
}