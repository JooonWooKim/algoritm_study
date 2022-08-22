package programmers;

public class Solutuion7 {
    public String solution(String phone_number) {
//        "01033334444", 11
//        "027778888", 8
        String answer = "";
        for (int i = 0; i < phone_number.length(); i++) {
            if (i<phone_number.length()-4) {
                answer += "*";
            }
            else{
                answer += phone_number.charAt(i);
            }
        }
        return answer;
    }
}

//class Solution {
//    public String solution(String phone_number) {
//        String answer = "";
//        for(int i = 0; i < phone_number.length(); i++){
//            if(i < phone_number.length()-4){
//                answer += "*";
//            }
//            else{
//                answer += phone_number.charAt(i);
//            }
//        }
//        return answer;
//    }
//}

