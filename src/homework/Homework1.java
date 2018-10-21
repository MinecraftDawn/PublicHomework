package homework;

import java.util.Scanner;

//判斷輸入數字是不是整數
public class Homework1 {
    private static String str = "";

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入一整數");
        int num = scanner.nextInt();

        boolean prime = true;

        int copyNum = num;
        for (int i = 2; i <= copyNum; i++) {
            if (num % i == 0) {
                while (true) {
                    if (copyNum % i == 0) {
                        copyNum /= i;
                        str += i + " ";
                    } else {
                        break;
                    }
                }
                prime = false;
            }
        }

        if (prime) {
            System.out.println(num + "是質數");
        } else {
            System.out.println(num + "不是質數");
            System.out.println(str);
        }

    }

}
