import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {8, 8, 5, 1, 0, 3};
        System.out.println(countUniqueElements(array)); // Виведе: 4
    }

    public static int countUniqueElements(int[] array) {
        if (array.length == 0) return 0;

        Arrays.sort(array);
        int uniqueCount = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i-1]) {
                uniqueCount++;
            }
        }

        return uniqueCount;
    }
}