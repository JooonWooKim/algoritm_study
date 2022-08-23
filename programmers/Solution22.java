package programmers;

public class Solution22 {
//    1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수,
//    solution을 만들어 보세요.
//    소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
//            (1은 소수가 아닙니다.)
    public int solution(int n) {
        //answer가 소수의 갯수
        int answer = 0;
        //s는 n의 소수?

        for (int i = 2; i <= n; i++) {
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i%j == 0){
                    flag = false;
                    break;
                }
            }
            //n이 소수일 경우에 대한 조건
            if(flag == true){
                answer++;
            }
        }
        return answer;
    }
}
