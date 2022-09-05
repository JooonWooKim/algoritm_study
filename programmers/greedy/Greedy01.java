package programmers.greedy;

public class Greedy01 {
    public static void main(String[] args) {
       int n = 1260;
       //거슬러 줘야할 동전의 갯수
       int cnt = 0;
       int[] coinTypes = {500, 100, 50, 10};

        for (int i = 0; i < 4; i++) {
            cnt += n / coinTypes[i];
            n &= coinTypes[i];
        }
        System.out.println(cnt);
        }
    }
//    카운터에서 거스름돈으로 사용할 500원, 100원, 50원, 10원짜리 동전이 무한히 존재한다고 가정.
//    손님에게 거슬러 주어야 할 돈이 N원 일때 거슬러 주어야 할 동전의 최소 개수
