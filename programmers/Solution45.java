package programmers;

import java.util.Arrays;

public class Solution45 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int matchCnt = 0;
        int zeroCnt = 0;
        //1. 두 배열을 비교하여 최저 순위 계산,
        //  -> lottos에서 번호를 알 수 없는 것은 그대로 0으로 둔채,
        //현재 상태에서 lottos의 요소와 win_numbers의 요소가 매칭하는 개수를 확인한다.

        //lottos = [44, 1, 0, 0, 31, 25]
        //win_nums = [31, 10, 45, 1, 6, 19]
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < 6; j++) {

        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        for (int lotto:lottos) {
            if(Arrays.binarySearch(win_nums, lotto) >= 0){
                matchCnt++;
            }
            if(lotto == 0){
                zeroCnt++;
            }
        }
//                if(lottos[i] == win_nums[j]){
//                    matchCnt++;
//                }
//            }
        answer[1] = Math.min(7-matchCnt, 6);

        answer[0] = Math.min(7-(matchCnt + zeroCnt), 6);

        return answer;
    }
}