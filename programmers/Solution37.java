package programmers;

import java.util.Arrays;

public class Solution37 {
    //배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을때, k번째에 있는 수를 구한다.

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[]temp = new int[commands[i][1] - (commands[i][0]-1)];
            for (int j = 0; j < temp.length; j++) {
                temp[j] = array[j+(commands[i][0]-1)];
            }
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }
        return answer;
    }
}
