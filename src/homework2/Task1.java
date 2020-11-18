package homework2;

import java.util.*;
import java.util.Collections;

public class Task1 {

    public static void main(String[] args) {

        Integer[] a = {2, 3, 1, 7, 11};
        Arrays.sort(a, Collections.reverseOrder());

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");

        }

    }
}
