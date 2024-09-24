package powerpackage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class PowerFinderTest {
    @Test
    void shouldReturnOneWhenOneRaisedToOne() {
        PowerFinder powerFinder = new PowerFinder();
        int actualPower = powerFinder.findPower(1, 1);
        int expectedPower = 1;
        assertEquals(expectedPower, actualPower);
    }

    @Test
    void shouldReturnTwoWhenTwoRaisedToOne() {
        PowerFinder powerFinder = new PowerFinder();
        int actualPower = powerFinder.findPower(2, 1);
        int expectedPower = 2;
        assertEquals(expectedPower, actualPower);
    }

    @Test
    void shouldReturnFourWhenTwoRaisedToTwo() {
        PowerFinder powerFinder = new PowerFinder();
        int actualPower = powerFinder.findPower(2, 2);
        int expectedPower = 2 * 2;
        assertEquals(expectedPower, actualPower);
    }

    @Test
    void shouldReturnOneWhenTwoRaisedToThree() {
        PowerFinder powerFinder = new PowerFinder();
        int actualPower = powerFinder.findPower(3, 2);
        int expectedPower = 3 * 3;
        assertEquals(expectedPower, actualPower);
    }

}