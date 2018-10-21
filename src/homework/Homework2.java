package homework;

import java.util.Scanner;

//將數字由小排到大
public class Homework2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String str = "";

        str = scanner.nextLine();

        String[] tem = str.split(" ");

        int[] nums = new int[tem.length];

        for (int i = 0; i < tem.length; i++) {
            nums[i] = Integer.valueOf(tem[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int t = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = t;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }
}
