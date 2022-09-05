package programmers.sortArgorithm;

import java.util.Arrays;

public class Sort01 {
    public static void main(String[] args) {
        int n = 5;
        int[] a = {1,2,5,4,3};
        int[] b = {5,5,6,6,5};
        int k = 3;
        System.out.println("a1 = " + a);

        Arrays.sort(a);

        Arrays.sort(b);
        //a = {1,2,3,4,5}, b={5,5,5,6,6}

        for (int i = 0; i < k; i++) {
            if(a[i] < b[i]){
                int temp = a[i];
                a[i] = b[i];
                b[i] = temp;
            }
            else break;
        }
        long result = 0;
        for (int i = 0; i < n; i++) {
            result += a[i];
        }
        System.out.println("result = " + result);
    }
}
//동빈이는 두 개의 배열 A, B를 갖고 있는데, 두 배열은 N개의 원소로 구성되어 있다.
//최대 K번의 바꿔치기 연산을 할 수 있는데, 연산이란 배열 a에 있는 원소 하나와
//배열 b에 있는 원소 하나를 골라서 두 원소를 서로 바꾸는 것을 말한다.

//최종 목표는 배열 a의 모든 원소의 합이 최대가 되도록 하는 것이다.

//ex) a = {1,2,5,4,3}, b = {5,5,6,6,5}
