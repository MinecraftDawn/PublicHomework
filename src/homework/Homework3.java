package homework;

import java.util.Random;
import java.util.Scanner;

public class Homework3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        int num;
        for (int i = 0; i < 4; i++) {
            do {
                num = (new Random()).nextInt(10);
            }while (answer.contains(String.valueOf(num)));

            answer += num;
        }



    }
}
