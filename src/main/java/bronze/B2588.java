package bronze;

import java.util.Scanner;

public class B2588 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int A = Integer.parseInt(a);

        for(int i = b.length() -1; i >= 0; i--){
            char ch = b.charAt(i);
            int c = ch - '0';
            System.out.println(A * c);
        }
    System.out.println(A * Integer.parseInt(b));
    }
}
