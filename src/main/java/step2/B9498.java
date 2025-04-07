package step2;

import java.util.Scanner;

public class B9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a >= 90) {
            System.out.print("A");
        } else if (a < 90 && a > 79) {
            System.out.print("B");
        } else if (a < 80 && a > 69) {
            System.out.print("C");
        } else if (a < 70 && a > 59) {
            System.out.print("D");
        } else {
            System.out.print("F");
        }
    }
}
