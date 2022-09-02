package programmers;

import java.util.ArrayList;

public class Solution47 {
    public int[] solution(int []arr) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        int[] answer = {};

        int num = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != num){
                arrList.add(arr[i]);
                num = arr[i];
            }
        }

        answer = new int[arrList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrList.get(i);
        }
        return answer;
    }
}