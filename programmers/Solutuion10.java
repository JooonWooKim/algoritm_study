package programmers;

public class Solutuion10 {
    public int[] solution(int n, int m) {
//        두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
//        배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
//        예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
//     n은 12 = {1,2,3,4,6,12}
//     m은 3= {1,3}
        int[] answer = new int[2];
        int a = Math.max(n, m);
        //12, big
        int b = Math.min(n, m);
        //3, min
        while(b>0){
            int temp = b;
            b=a%b;
            a = temp;
        }
        answer[0] = a;
        //최대 공약수
        answer[1] = n*m/a;
        //최소 공배수

        return answer;
    }
}

//유클리드 호제법
//a,b의 최대공약수는 A를 B로 나눈 나머지 r이 있을 때, B와 r의 최대 공약수와 같다.
