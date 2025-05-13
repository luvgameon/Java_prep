package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }
      System.out.println(Arrays.toString(arr));
    }
}
