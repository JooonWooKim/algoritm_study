package programmers.greedy;

public class Greedy03 {
    public static void main(String[] args) {
        String s = "02984";
        long result = s.charAt(0) - '0';

        for (int i = 0; i < s.length(); i++) {
            //두 수 중에서 하나라도 '0' 혹은 '1'인 경우, 곱하기보다는 더하기를 수행하는 것이 효율적이다.
            int num = s.charAt(i) - '0';
            if(result <= 0 || num <= 1){
                result += num;
            }else{
                result *= num;
            }
        }
        System.out.println("result = " + result);
    }
}

//각 자리가 숫자(0부터 9)로만 이루어진 문자열 S가 주어졌을때,
// 왼쪽부터 오른쪽으로 하나씩 모든 숫자를 확인하며 'x'혹은 '+' 연산자를 넣어서 결과적으로
//만들어질 수 있는 가장 큰수를 구하기.
