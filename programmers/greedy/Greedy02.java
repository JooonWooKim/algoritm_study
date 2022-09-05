package programmers.greedy;


public class Greedy02 {
    public static void main(String[] args) {
        int n = 25;
        int k = 3;

        int count = 0;

        while (true) {
            //N이 K로 나누어 떨어지는 수가 될 때까지 빼기
            if (n == 1) {
                break;
            } else if(n%k == 0){
                n /= k;
                count++;
            }else{
                n-= 1;
                count++;
            }
        }
        System.out.println(count);
    }
}

//어떠한 수 N이 1이 될 때까지 다음의 두 과정 중 하나를 반복적으로 선택하여 수행하기.
//단, 두 번째 연산은 N이 K로 나누어 떨어질 때만 선택할 수 있다.
//1. N에서 1을 뺀다.
//2. N을 K로 나눈다.
//N과 K가 주어질 때 N이 1이 될 때까지 1번 혹은 2번의 과정을 수행해야 하는 최소 횟수를
//구하는 프로그램을 작성하기.
