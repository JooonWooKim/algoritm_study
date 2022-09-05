package programmers.sortArgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Sort04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int answer = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);

        int prev = 0;
        //이전까지의 대기시간 누적합
        int sum = 0;
        //사람별 대기시간 총합

        for (int i = 0; i < n; i++) {
            sum += prev+arr[i];

            prev += arr[i];
        }
        System.out.println(sum);
    }
}

//사람은 1번부터 N번까지 번호가 매개져 있다.
//