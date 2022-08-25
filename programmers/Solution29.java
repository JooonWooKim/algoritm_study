package programmers;

import java.util.Arrays;

public class Solution29 {
    public int[] solution(int[] arr, int divisor) {
        //array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로
        // 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
        //divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
        /**
         * 1. array안에 있는 값을 String(int)으로 꺼내기
         * 1-1. array에 안에 있는 값을 반복문으로 돌려서 하나씩 나누기?
         * 2. ele값을 divisor로 나누기
         * 3. 나머지가 0이라면 solution에 담기
         * 4. 나머지가 있다면 solution에 -1을 담기
         * */

        int cnt = 0;

        //1. arr값중에 divisor로 나뉘어지는 값이  있을 경우
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                cnt++;
            }
        }
        if(cnt == 0){
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[cnt];
        for (int i = 0, j=0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer[j++] = arr[i];
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}
