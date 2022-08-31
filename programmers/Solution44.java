package programmers;

import java.util.Locale;

public class Solution44 {
    public String solution(String new_id) {
        //1. new_id의 모든 대문자를 대응되는 소문자로 치환하기
        String answer = new_id.toLowerCase();

        answer = answer.replaceAll("[^-_.a-z0-9]", ""); //2단계
        answer = answer.replaceAll("[.]{2,}", ".");
        answer = answer.replaceAll("^[.]|[.]$", "");

        if(answer.equals("")){
            answer += "a";
        }
        if(answer.length() >= 16){
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$","");
        }
        if(answer.length() <= 2){
            while(answer.length() < 3){
                answer += answer.charAt(answer.length()-1);
            }
        }
        return answer;
    }
}