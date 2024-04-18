import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerCharacterTest {

    @BeforeEach
    void resetState() {
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
    }

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

    @Test
    void moveWhenCharWThenReturnX0Y1() {
        //GIVEN
        char character = 'W';

        //WHEN
        int[] actual = PlayerCharacter.move(character);

        //THEN
        int[] expected = {0,1};
        assertArrayEquals(expected, actual);
    }

    @Test
    void moveWhenCharAThenReturnXMinus1Y0() {
        //GIVEN
        char character = 'A';

        //WHEN
        int[] actual = PlayerCharacter.move(character);

        //THEN
        int[] expected = {-1,0};
        assertArrayEquals(expected, actual);
    }

    @Test
    void moveWhenCharDThenReturnX1Y0() {
        //GIVEN
        char character = 'D';

        //WHEN
        int[] actual = PlayerCharacter.move(character);

        //THEN
        int[] expected = {1,0};
        assertArrayEquals(expected, actual);
    }

    @Test
    void moveWhenCharSThenReturnX0YMinus1() {
        //GIVEN
        char character = 'S';

        //WHEN
        int[] actual = PlayerCharacter.move(character);

        //THEN
        int[] expected = {0,-1};
        assertArrayEquals(expected, actual);
    }


}
