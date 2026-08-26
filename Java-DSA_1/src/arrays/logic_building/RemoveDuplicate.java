package arrays.logic_building;

import java.util.Scanner;

public class RemoveDuplicate {

    static void removeDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = 0;
                }
            }
        }
    }

    static void display(int[] arr) {
        for (int x : arr) {
            if (x != 0)
                System.out.print(x + " ");
        }
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

        System.out.println("Before Remove Duplicate:");
        display(arr);

        removeDuplicate(arr);

        System.out.println("After Remove Duplicate:");
        display(arr);
    }
}