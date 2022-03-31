package Section01;

import java.util.Scanner;

/**
 * 2. 대소문자 변환
 * 설명
 * <p>
 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
 * <p>
 * 출력
 * 첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
 * StuDY
 * 예시 출력 1
 * <p>
 * sTUdy
 */
public class Solution_02 {

    public String solution(String str) {
        StringBuilder answer = new StringBuilder();

        for (char s : str.toCharArray()) {
//            if (Character.isLowerCase(s)){
//                answer.append(Character.toUpperCase(s));
//            }else {
//                answer.append(Character.toLowerCase(s));
//            }
            // 다른 풀이
            if (s >= 97 && s < 122) { // 소문자일 경우 대문자 변환
                answer.append((char) (s - 32));
            } else {
                answer.append((char) (s + 32));
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution_02 st = new Solution_02();
        Scanner sn = new Scanner(System.in);

        String str = sn.next();

        System.out.println(st.solution(str));
    }
}
