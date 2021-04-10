public class Calculate {
    public static final int REQUIRED_NUM = 5;
    public static final int MIN_COUNT = 3;

    public static int[] conclusionMatrix(int[][] array) {
        int size = findSizeOfMas(array);
        int[] mas = new int[size];
        for (int i = 0, k = 0; i < array.length; i++) {
            int count = calculateCountOfElement(array[i]);
            if (count >= MIN_COUNT) {
                mas[k] = i + 1;
                k++;
            }
        }
        return mas;
    }

    private static int findSizeOfMas(int[][] array) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            int count = calculateCountOfElement(array[i]);
            if (count >= MIN_COUNT) {
                k++;
            }
        }
        return k;
    }

    public static int calculateCountOfElement(int[] array) {
        int count = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == REQUIRED_NUM) {
                count++;
            }
        }
        return count;
    }
}
