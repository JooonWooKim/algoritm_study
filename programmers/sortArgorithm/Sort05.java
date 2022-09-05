package programmers.sortArgorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Sort05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String[] arr = new String[n];

        scanner.nextLine();

        //String배열 arr에 저장
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //단어 길이가 같을 경우
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }else{
                    return o1.length() - o2.length();
                }
            }
        });

        System.out.println(arr[0]);

        for (int i = 0; i < n; i++) {
            if(!arr[i].equals(arr[i-1])){
                System.out.println(arr[i]);
            }
        }
    }
}
//1. 길이가 짧은것부터 정렬하기
//2. 길이가 같으면 사전 순으로
