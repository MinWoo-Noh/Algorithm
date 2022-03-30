package Section01;

import java.util.Scanner;

/**
 * 1. 문자 찾기
 * <p>
 * 예시 입력 1
 * <p>
 * Computercooler
 * c
 * 예시 출력 1
 * <p>
 * 2
 */
public class Section01_01 {
    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == t) {
//                answer++;
//            }
//        }

        for(char x : str.toCharArray()){
            if (x == t){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Section01_01 st = new Section01_01();
        Scanner sn = new Scanner(System.in);

        String str = sn.next();
        char c = sn.next().charAt(0);

        System.out.println(st.solution(str, c));
    }
}
