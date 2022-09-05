package programmers.greedy;

import java.util.Arrays;

public class Greedy04 {
    public static void main(String[] args) {
        int[] x = {2, 3, 1, 2, 2};
        int n = x.length;

        int result = 0;
        //총 그룹의 수
        int count = 0;
        //현재 그룹에 포함된 모험가의 수
        Arrays.sort(x);
        //x = {1, 2, 2, 2, 3};

        for (int i = 0; i < n; i++) {
            count += 1;
            //현재 그룹에 해당 모험가를 포함시키기
            if(count >= x[i]){
                result += 1;
                count = 0;
            }
        }
        System.out.println("result = " + result);
    }
}

//여행을 떠날 수 있는 그룹 수의 최대값.

//모함가의 수는 N,
// '공포도'가 높은 모험가는 쉽게 공포를 느껴서 위험 상황에서 제대로 대처할 능력이 떨어진다.
//공포도가 x인 모험가는 반드시 x명 이상으로 구성한 모험가 그룹에 참여해야
