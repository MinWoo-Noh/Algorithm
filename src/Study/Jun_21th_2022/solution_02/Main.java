package Study.Jun_21th_2022.solution_02;

import java.util.Scanner;

/**
 * 1. 문자 찾기
 *
 * 예시 입력 1
 *
 * Computercooler
 * c
 * 예시 출력 1
 *
 * 2
 */
public class Main {
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
        Main st = new Main();
        Scanner sn = new Scanner(System.in);

        String str = sn.next();
        char c = sn.next().charAt(0);

        System.out.println(st.solution(str, c));
    }
}
