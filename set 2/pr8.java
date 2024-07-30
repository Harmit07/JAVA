import java.util.*;

public class pr8 {

    static int n;

    static int arr[];
    static int count = 0;

    static void array() {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size of an array: ");
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter the value of element: " + i + ":");
            arr[i] = sc.nextInt();
            if (arr[i] == 9) {
                count++;

            }

        }
        System.out.print("The number of Nine's you have entered in array is : " + count);

    }

    public static void main(String[] args) {

        array();

    }
}

