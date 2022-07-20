package InterView.RSP;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    // 가위바위보 문제
    // C는 A 와 B 가 서로 무엇을 내는지 알고있다.
    // A 와 B 랑 가위바위보를 할때 무엇을 내야 이기는지 출력해라.
    // A 와 B 의 입력값은 동일하다.
    // ez) RSSP
    //     SSPS
    //     RRSS

    public String solution(String a, String b) {

        String[] strA = a.split("");
        String[] strB = b.split("");

        // R(주먹) S(가위) P(보자기)
        String R = "R";
        String S = "S";
        String P = "P";
        ArrayList<String> RSP = new ArrayList<>();

        for (int i = 0; i < strA.length; i++)
                if (strA[i].equals(R) && strB[i].equals(S)
                        || strA[i].equals(S) && strB[i].equals(R)
                        || strA[i].equals(S) && strB[i].equals(S)) {
                    RSP.add(R);
                } else if (strA[i].equals(R) && strB[i].equals(R)
                        || strA[i].equals(R) && strB[i].equals(P)
                        || strA[i].equals(P) && strB[i].equals(R)) {
                    RSP.add(P);
                } else if (strA[i].equals(P) && strB[i].equals(S)
                        || strA[i].equals(P) && strB[i].equals(P)
                        || strA[i].equals(S) && strB[i].equals(P)) {
                    RSP.add(S);

            }
        String answer = "";
        for(String item : RSP){
            if(!RSP.contains(item))
                RSP.add(item);
            answer = String.join("", RSP);
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        String str = sn.next();
        String stt = sn.next();

        Solution sl = new Solution();

        sl.solution(str, stt);
    }
}
