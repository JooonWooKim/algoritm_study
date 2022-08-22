package programmers;

public class Solution18 {
//    정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수,
//    solution을 완성해주세요.
//    ex) n이 12일 경우 1,2,3,4,6,12이다. 다 더하면 28
//    n을 i로 나눠서 나머지랑 i랑 곱했을때 == n이면 answer에 더해주기
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i == 0){
                answer += i;
            }
        }
        return answer;
    }
}
