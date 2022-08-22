package programmers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution14 {
//    함수 solution은 정수 n을 매개변수로 입력받습니다.
//    n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
//    예를들어 n이 118372면 873211을 리턴하면 됩니다.
    public long solution(long n) {
        long answer = 0;
        //n을 toString 메소드로 문자열로 변환
        String str = Long.toString(n);
        List<Character> list = new ArrayList<Character>();

        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
            //str을
        }

        list.sort(Comparator.reverseOrder());

        String temStr = "";
        for (int i = 0; i < list.size(); i++) {
            temStr += list.get(i);
        }
        return Long.parseLong(temStr);
    }
}
