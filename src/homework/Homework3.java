package homework;

import java.util.Random;
import java.util.Scanner;

public class Homework3 {
    //猜數字，最多猜十次
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        String input;
        int num;
        for (int i = 0; i < 4; i++) {
            do {
                num = (new Random()).nextInt(10);
            } while (answer.contains(String.valueOf(num)));

            answer += num;
        }


        for (int i = 0; i < 10; i++) {
            int A = 0;
            int B = 0;
            input = scanner.nextLine();
            for (int j = 0; j < 4; j++) {
                if (input.charAt(j) == answer.charAt(j)) {
                    A++;
                }

                for (int k = j + 1; k < 4; k++) {
                    if (input.charAt(j) == answer.charAt(k)) {
                        B++;
                    }
                }
            }
            System.out.println(A + "A; " + B + "B");
        }


    }
}
