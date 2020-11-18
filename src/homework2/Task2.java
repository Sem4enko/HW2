package homework2;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {4, 28, -7, 9, -10, 12, 56, -32};
        int sum = 0;

        for (int x : arr) {
            if (x > 0)
                sum += x;
        }
        System.out.println(sum);
    }
}