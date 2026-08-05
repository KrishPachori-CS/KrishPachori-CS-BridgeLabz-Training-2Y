package arrays.logic_building;

import java.util.Scanner;

public class SwapArray {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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

        System.out.println("Before Swap:");
        display(arr);

        System.out.print("Enter first index: ");
        int i = sc.nextInt();

        System.out.print("Enter second index: ");
        int j = sc.nextInt();

        swap(arr, i, j);

        System.out.println("After Swap:");
        display(arr);
    }
}