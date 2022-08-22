package programmers;

public class Solution9 {
        public int solution(int num){
            //num이 짝수면 2로 나누고, 홀수면 *3 +1
            //결과가 1이 될때까지 해라
            //ex) num = 6
            int answer = 0;

            while(num != 1){
                answer++;
                if(num%2 == 0){
                    num = num/2;
                } else if (num%2 == 1) {
                    num = num*3+1;
                }
                if(answer == 500){
                    answer = -1;
                    break;
                }
            }
            return answer;
        }
    }