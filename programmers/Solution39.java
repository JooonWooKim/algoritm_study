package programmers;

import java.util.HashSet;

public class Solution39 {
    // 홍 박사님은 당신에게 자신의 연구실에 있는 총 N 마리의 폰켓몬 중에서 N/2마리를 가져가도 좋다고 했습니다.
    // 홍 박사님 연구실의 폰켓몬은 종류에 따라 번호를 붙여 구분합니다.
    // 따라서 같은 종류의 폰켓몬은 같은 번호를 가지고 있습니다

    //1. 최대값을 구하기 위해서 nums의 length에 2를 나눈 값을 max에 대입한다.
    //2. 중복을 제거한 값을 구하기 위해 Set을 이용해서 nums를 담아준다.
    //3. 중복을 제거한 Set의 크기가 max보다 크면 max를 작으면 Set 사이즈를 리턴한다.
   public int solution(int[] nums) {
       int max = nums.length / 2;

       //중복 제거
       HashSet<Integer>numSet = new HashSet<>();
       for (int num: nums) {
           numSet.add(num);
       }
       if(numSet.size() > max){
           return max;
       }else {
           return numSet.size();
       }
    }
}
