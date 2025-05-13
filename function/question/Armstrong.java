package function.question;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
            System.out.println("Is Number is Armstrong -->"+IsNum(num));
        
    }
    public static boolean IsNum(int num) {
        int sum = 0;
        int temp = num;
        while(temp!=0){
            int r = temp%10;
            temp = temp/10;
            sum += r*r*r;
        }
        if(sum==num){
            return true;
        }
        return false;
    }
}