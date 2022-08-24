package programmers;

import java.util.Locale;

public class Solution26 {
//    대문자와 소문자가 섞여있는 문자열 s가 주어집니다.
//    s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True,
//    다르면 False를 return 하는 solution를 완성하세요.
//    'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다.
//    단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.

//    예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.
    ////////////////

    //1. p와 y의 갯수 세기
    //2. 소문자로 바꾸기
    //3. 배열을 반복하면서 p와 y가 있을때 count++
    //4. pCount하고 yCount가 같을때는 true, 다를때는 false;
    boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;
        //answer에 소문자로 바꿔서 ""로 잘라서 배열에 넣기
        String[] answer = s.toLowerCase().split("");

        for (int i = 0; i < answer.length; i++) {
            if(answer[i].equals("p")){
                pCount++;
            }
            if(answer[i].equals("y")){
                yCount++;
            }
        }
        if(pCount != yCount){
            return false;
        }
        return true;
    }
}
