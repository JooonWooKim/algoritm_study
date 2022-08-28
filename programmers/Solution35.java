package programmers;

public class Solution35 {
//    두 정수 left와 right가 매개변수로 주어집니다.
//    left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고,
//    약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
    public int solution(int left, int right) {
        int answer = 0;
        //약수의 갯수가 짝수인지 홀수인지 구분하기 위한 변수
        String a = "";
        //answer는 left하고 right의 약수의 갯수를 더한 값
        for (int i = left; i <= right; i++) {
            for (int j = 1; j <= i; j++) {
                if(i/j == 0){
                    //a에 13의 약수를 저장
                    a = String.valueOf(i%j);
                    int b = a.length();
                    answer += i;
                    if(b/2 != 0){
                        //answer는 left와 right를 다 더한 값인데, 홀수일경우에는 빼기
                        //약수의 갯수가 홀수 일 경우에는
                        answer -= i;
                    }
                }
            }
        }
        return answer;
    }
}
