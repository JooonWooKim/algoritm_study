package programmers;

import java.util.Arrays;

class Solution36 {
    public int solution(int n, int[] lost, int[] reserve) {
//      순차적으로 배열을 비교할 수 있게 정렬한다.
//      여벌 체육복을 가져온 학생이 도난당한 경우, 체육복을 빌려줄 수 없기 때문에 reserve배열에서 제외
//        reserve[j]의 값을 -1로 변경
//        lost[i]의 값도 -1로 변경해 도난당한 대상에서 제외한다.
//      여벌 체육복을 가져온 학생이 자기번호의 앞,뒤 학생에게 체육복을 빌려준다.
//        lost[i]-1 == reserve[j] 또는 lost[i]+1 == reserve[j]
//        reserve[j]의 값을 -1로 변경

        int answer = n-lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        //여벌 체육복을 가져온 학생이 도난당한 경우
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if(lost[i] == reserve[j]){
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        //도난당한 학생에게 체육복을 빌려주는 경우
        for (int i = 0; i <lost.length ; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if((lost[i]-1 == reserve[j]) || (lost[i]+1 == reserve[j])){
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}