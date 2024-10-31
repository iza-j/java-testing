public class Bubble {

    public static void main(String[] args) {

        int[] numbers = {1, 4, 2433422, 0, 78, -2, -2, 6, 8, -7};
        int len = numbers.length;

        for (int x = 0; x < len; x++) {
            for (int y = 1; y < len; y++) {
                if (numbers[y - 1] > numbers[y]) {
                    int temp = numbers[y];
                    numbers[y] = numbers[y - 1];
                    numbers[y - 1] = temp;
                }
            }
        }

        for (int x = 0; x < len; x++) {
            if (x == len - 1) {
                System.out.print(numbers[x]);
            } else {
                System.out.print(numbers[x] + ", ");
            }
        }
    }
}