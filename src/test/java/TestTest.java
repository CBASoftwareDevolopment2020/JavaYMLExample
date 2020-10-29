import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestTest {
    @Test
    public void quickTest() {

        // assert statements
        assertEquals(0, 0);
    }

    @Test
    public void TestquickFailing(){
        assertEquals(1,2);
    }
}