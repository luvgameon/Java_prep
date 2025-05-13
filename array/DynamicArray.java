package array;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
       /*
        list.add(12);
        list.add(112);
        list.add(122);
        list.add(14122);
        list.add(12312);
        list.add(1122);
        list.add(1452);
        System.out.println(list);
        list.set(0, 754321788);
        System.out.println(list);
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        System.out.println("Initial list: " + list);
        in.close();
    }
}
