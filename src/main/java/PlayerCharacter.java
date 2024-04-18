public class PlayerCharacter {

    static int x = 0;
    static int y = 0;

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public static int[] move(char character) {
        if (character == 'W') {
            y++;
            return new int[]{x,y};
        } else if (character == 'S') {
            y--;
            return new int[]{x,y};
        } else if (character == 'A') {
            x--;
            return new int[]{x,y};
        } else if (character == 'D') {
            x++;
            return new int[]{x,y};
        }
        return new int[]{x,y};
    }
}
