package programmers.sortArgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Sort02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr= new int[n];

        for (int i = 0; i < n; i++) {
//            System.out.println(i+"번째 넣을 수를 입력");
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int val:arr
             ) {
            System.out.println(val);
        }
    }
}

//N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
