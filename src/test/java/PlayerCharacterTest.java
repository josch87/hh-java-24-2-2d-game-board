import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerCharacterTest {
    @Test
    void getXReturn0() {
        //GIVEN

        //WHEN
        int actual = PlayerCharacter.getX();

        //THEN
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void getYReturn0() {
        //GIVEN

        //WHEN
        int actual = PlayerCharacter.getY();

        //THEN
        int expected = 0;
        assertEquals(expected, actual);
    }
}
