public class Main {
    public static void main(String[] args) {
        int[] elements = {1, 2, 3, 4, 5};
        System.out.println(sum(elements, 0));
        System.out.println(factorial(5));
    }

    public static int sum(int[] numbers, int index) {
        if (index == numbers.length - 1) {
            return numbers[index];
        }

        return numbers[index] + sum(numbers, index + 1);
    }

    public static int factorial(int num) {

        if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
