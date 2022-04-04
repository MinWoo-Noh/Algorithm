package BOJ.Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2475_Bronze5 {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 0;

        for (int i = 0; i < 5; i++) {
            result += (int) Math.pow(Integer.parseInt(st.nextToken()), 2);
        }

        bw.write(String.valueOf(result % 10));
        bw.flush();

    }
}
