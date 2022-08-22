package programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Solution17 {
//    문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
//    각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
//    각 단어의 짝수번째 알파벳은 대문자로,
//    홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
    public String solution(String s) {
        String answer = "";
        //공백을 기준으로 자르면 그게 단어가 되는데,
        String[] str = s.split("");
//        str[0]의 2번째 숫자를 대문자로 바꾸기
        int index = 0;
        for (int i = 0; i < str.length; i++) {
            if(str[i].equals(" ")){
                index = 0;
            }else if(index % 2 ==0){
                str[i] = str[i].toUpperCase();
                index++;
            }else if(index % 2 != 0){
                str[i] = str[i].toLowerCase();
                index++;
            }
            answer += str[i];
        }
        return answer;
    }
}
