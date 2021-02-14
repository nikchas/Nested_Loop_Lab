package NestedLoopLab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        boolean flag = false;
        int count = 0;
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                int sum = i + j;
                count++;

                if (sum == magicNum){
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", count, i, j, sum);
                    flag = true;
                    break;
                }
            }
            if (flag == true){
                break;
            }
        }

        if (flag == false){
            System.out.printf("%d combinations - neither equals %d", count, magicNum);
        }
    }
}