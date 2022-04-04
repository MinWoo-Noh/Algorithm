package BOJ.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1546_Bronze1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        double[] array = new double[T];

        double max = 0;
        double result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < T; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array);
        max = array[array.length - 1];

        for (int i = 0; i < T; i++) {
            double val = array[i]/max*100;
            array[i] = (int) Math.round(val);
        }

        for (double average : array){
            result += average;
        }

        System.out.println(result/T);

    }
}
