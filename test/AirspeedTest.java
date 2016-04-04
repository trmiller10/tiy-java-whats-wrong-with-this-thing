import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AirspeedTest extends OutputTest {

    @Test
    public void testOutput(){
        Airspeed.main(null);

        assertThat(outputStream.toString(), is(
                "Q: What is the unladen airspeed velocity of a swallow?\n" +
                "A: About 24 miles per hour.\n"
        ));
    }

}
