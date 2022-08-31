package programmers;

public class Solution43 {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10;
        int right = 12;

        for (int tmp:numbers) {
            if(tmp == 1 || tmp == 4 || tmp == 7){
                answer += "L";

            }
        }
        return answer;
    }
}

