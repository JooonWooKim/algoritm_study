package programmers;

import java.util.Arrays;
import java.util.Collections;

public class Solution25 {
//    문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수,
//    solution을 완성해주세요.
//    s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
    public String solution(String s) {
        String answer[] = s.split("");
        String str = "";
        Arrays.sort(answer, Collections.reverseOrder());

        for (int i = 0; i < answer.length; i++) {
            str += answer[i];
        }
        return str;
    }
}
