package programmers;

import java.util.Arrays;

public class Solution33 {
    //물품을 구매해 줄 때는 각 부서가 신청한 금액만큼을 모두 지원해 줘야 합니다.
    // 예를 들어 1,000원을 신청한 부서에는 정확히 1,000원을 지원해야 하며,
    // 1,000원보다 적은 금액을 지원해 줄 수는 없습니다.
    //부서별로 신청한 금액이 들어있는 배열 d와 예산 budget이 매개변수로 주어질 때,
    // 최대 몇 개의 부서에 물품을 지원할 수 있는지 return 하도록 solution 함수를 완성해주세요
    //1.오름차순으로 재정렬하기
    //2. 작은 수부터 더하는 것이 가장 최대의 값을 낸다.
//    3. budget보다 클 때 종료하거나, 더 더 했는데 작거나 같을 경우 예외적으로 처리한다.
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            if(budget < 0)
                break;
            answer++;
        }
        //answer는 최대 지원할 수 있는 부서의 개수
        return answer;
    }
}
