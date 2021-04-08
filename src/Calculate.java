public class Calculate {
    public static int[] conclusionMatrix(int[][] array) {
        int size = findSizeofMas(array);
        int[] mas = new int[size];
        int k = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 5) {
                    count++;
                }
            }
            if(count >= 3) {
                mas[k] = i + 1;
                k++;
            }
            count = 0;
        }
        return mas;
    }

    private static int findSizeofMas(int[][] array) {
        int k = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 5) {
                    count++;
                }
            }
            if(count >= 3) {
                k++;
            }
            count = 0;
        }
        return k;
    }
}
