package array.questions;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        System.out.println(list);
        Reverse(list);
        System.out.println(list);

    }

    public static void swap(ArrayList<Integer> arr, int index1, int index2) {
        int temp = arr.get(index1);
        arr.set(index1, arr.get(index2));
        arr.set(index2, temp);
    }

    public static void Reverse(ArrayList<Integer> arr) {
        int s = 0;
        int e = arr.size()-1;
        while (s < e) {
            swap(arr, s, e);
            s++;
            e--;
        }
    }
}
