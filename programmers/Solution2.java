package programmers;

import java.util.*;

public class Solution2 {
    public int[] solution(int[] answers) {
        //1번 수포자가 찍는 방식: 1, 2, 3, 4, 5
        //2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5,
        //3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5

        int[][] patterns = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] count = new int[3];

        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < answers.length; j++) {
                if(patterns[i][j% patterns[i].length] == answers[j])count[i]++;
            }
        }

        int max = Math.max(count[0], Math.max(count[1], count[2]));
        List<Integer>list = new ArrayList<>();
        for (int i = 0; i < count.length; i++) {
            if(max == count[i]) list.add(i+1);
        }

        int[] answer = new int[list.size()];
        int cnt = 0;
        for(int num: list){
            answer[cnt++] = num;
        }
        return answer;
    }
}