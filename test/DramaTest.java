import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DramaTest extends OutputTest {

    @Test
    public void testOutput(){
        Drama.main(null);

        assertThat(outputStream.toString(), is("Brace yourselves, winter is coming!\n"));
    }
}