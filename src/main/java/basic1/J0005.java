package basic1;

import java.util.Scanner;

public class J0005 {
    public static void main(String[] args) {
        System.out.println("두 개의 숫자를 입력해주세요.");

        Scanner sc = new Scanner(System.in);
        String fullInput = sc.nextLine();
        String[] input = fullInput.split("[\\s,]+");

        if (input.length == 2) {
            try {
                int num1 = Integer.parseInt(input[0]);
                int num2 = Integer.parseInt(input[1]);
                int max = Math.max(num1, num2);
                if (num1 == num2) {
                    System.out.println("두 수는 같습니다.");
                } else {
                    System.out.println("더 큰 수는 " + max + "입니다.");
                }
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 두 개의 숫자를 입력해주세요.");
            }
        } else {
            System.out.println("잘못된 입력입니다. 숫자는 두 개를 입력하셔야 합니다.");
        }
    }
}