package programmers;

import java.util.*;
public class Solutuion5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < a; i++) {
            System.out.print("*");
            for (int j = 0; j < b; j++) {
                System.out.print("*");
            }
        }
        System.out.println(a + b);
    }
}
