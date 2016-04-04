import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MovieTest extends OutputTest {

    @Test
    public void testOutput(){
        Movie.main(null);

        assertThat(outputStream.toString(), is("I like horror movies. There's nothing like a good slasher.\n"));
    }
}