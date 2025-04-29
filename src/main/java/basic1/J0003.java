package basic1;

import java.util.Scanner;

public class J0003 {
    public static void main(String[]args){
        System.out.println("더할 숫자 2개를 입력해주세요.");

        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("총계: " + (a + b));
        }else{
            System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
        }


    }
}
