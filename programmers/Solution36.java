package programmers;

class Solution36 {
    public int solution(int n, int[] lost, int[] reserve) {
//        여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다.
//        학생들의 번호는 체격 순으로 매겨져 있어,
//        바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다.
//        전체 학생의 수 n,
//        체육복을 도난당한 학생들의 번호가 담긴 배열 lost,
//        여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때,
//        체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.

//        1.체육복을 빌릴수있는 상황은 체육복을 갖고있는 학생이 잃어버린 학생의 뒷 번호일 경우에
        int answer = 0;
        int have = 0;

        //lost[i]가  reserve[lost[i]+1]가 체육복이 있을경우에
        for (int i = 0; i < n; i++) {

        }
        for (int i = 0; i <=n ; i++) {
            if(lost[i] == reserve[i]){
                answer++;
            }
        }
        return answer;
    }
}