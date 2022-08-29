package programmers;


public class Solution38 {
    //완주하지 못한 선수의 이름을 return해서 answer에 넣기.
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        for (int i = 0; i < participant.length; i++) {
            for (int j = 0; j < completion.length; j++) {
                if(participant[i] == completion[j]){
                    continue;
                }
                else if(participant[i] != completion[j]){
                    answer = participant[i];
                }
            }
        }

        return answer;
    }
}
