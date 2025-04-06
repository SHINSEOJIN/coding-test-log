package step2;

import java.util.Scanner;

public class B1330 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();

        if(a>b){
            System.out.print(">");
        }else if(a<b){
            System.out.print("<");
        }else if(a==b){
            System.out.print("==");
        }
    }
}
