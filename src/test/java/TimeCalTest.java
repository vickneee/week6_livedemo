import org.junit.Test;

import static org.junit.Assert.*;

public class TimeCalTest {

    @Test
    public void calTime() {
        assertEquals(1.0, TimeCal.calTime(100, 100), 0.0001);
    }
}