package programmers;

public class Solution41 {
    public int solution(int[] absolutes, boolean[] signs) {
//        어떤 정수들이 있습니다.
//        이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와
//        이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다.
//        실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.

        //abs에 있는 객체를 sign index에 있는 값하고 비교해서 -인지, +인지 비교하기
        int result = 0;

        for (int i = 0; i < signs.length; i++) {
            if (signs[i]){
                result += absolutes[i];
            }else{
                result -= absolutes[i];
            }
        }
        return result;
    }
}
