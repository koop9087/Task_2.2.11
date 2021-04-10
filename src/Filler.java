import java.util.Random;

public class Filler {
    public static int MAX_VAL = 15;
    public static Random random = new Random();

    public static void fill(int[][] array) {
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(MAX_VAL + 1);
            }
        }
    }
}
