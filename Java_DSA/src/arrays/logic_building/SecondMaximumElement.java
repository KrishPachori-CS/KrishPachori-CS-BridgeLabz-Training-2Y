package arrays.logic_building;

import java.util.Scanner;

public class SecondMaximumElement {

    static int secondMaximum(int[] arr) {
        int max = arr[0];
        int second = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                second = max;
                max = arr[i];
            } else if (arr[i] > second && arr[i] != max) {
                second = arr[i];
            }
        }

        return second;
    }

    static void display(int[] arr) {
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Array:");
        display(arr);

        System.out.println("Second Maximum: " + secondMaximum(arr));
    }
}