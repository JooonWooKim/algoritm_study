package programmers;

public class Solution8 {
    //[1,2,3,4]
    //정수를 담고 있는 배열 arr의 평균값을 return하는 함수,
    // solution을 완성해보세요.
    public double solution(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            //반복문을 이용해 배열의 값 하나씩 sum 변수에 더해준다.
        }
        double answer = (double)sum/arr.length;
        //sum/배열의 길이를 나누어 평균값을 내준다. answer는 double형이기때문에
//        double으로 형으로 변환해준다.
        return answer;
    }
}
