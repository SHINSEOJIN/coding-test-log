package basic1;

import java.util.Scanner;

public class J0004 {
    public static void main(String[] args) {
        System.out.println("홀짝을 판별할 숫자 1개를 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        String inputLine = sc.nextLine();
        String[] parts = inputLine.trim().split("[\\s,]+");

        if (parts.length == 1) {
            try {
                int num = Integer.parseInt(parts[0]);
                if (num % 2 == 0) {
                    System.out.println("짝수입니다.");
                } else {
                    System.out.println("홀수입니다.");
                }
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
            }
        }else {
            System.out.println("잘못된 입력입니다. 1개의 숫자를 입력해주세요.");
        }
    }
}
