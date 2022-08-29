package programmers;

import java.util.Arrays;

public class Solution_38 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        //2. 두 배열이 다를 때까지 찾기.
        int i = 0;
        for (i = 0; i < completion.length; i++) {
            if(!participant[i].equals((completion[i]))){
                break;
            }
        }
        return participant[i];
    }
}
