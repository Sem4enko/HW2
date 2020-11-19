package homework2;

public class Task4 {

    private static void showArr(Integer[] arr) {
        for (int i : arr) {
            System.out.print(i +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Integer[] arr = {3, 2, 3, 1, 4, 2, 8, 3};
        for (int x = 0; x < arr.length; x++) {
            for (int y = x + 1; y < arr.length; y++) {
                if (arr[x].equals(arr[y])) {
                    arr[y] = 0;
                }
            }
        }
        System.out.println();
        showArr(arr);
    }
}
