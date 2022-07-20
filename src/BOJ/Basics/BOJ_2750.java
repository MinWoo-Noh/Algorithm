package BOJ.Basics;

/*
 시간복잡도
 - 일반적으로 수행 시간은 1억번의 연산을 1초의 시간으로 간주하여 예측

 코딩 테스트에서는 빅 - 오 표기법 O(N)을 기준으로 수행시간을 계산한다. O(N) 촤 악의 경우를 뜻함

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2750 {

    // 첫번째 방법 인덱스부터 시작하여 뒤의 인덱스들의 값들과 비교하여 최솟값들을 차곡차곡 쌓아가는 방법이다.
    // 구현이 가장 쉬우나 시간복잡도가 O(n^2) 으로 좋은 성능은 아니다.
    // [선택정렬]
    public static void getSelectionSort(int N, int[] arr){
        for (int i = 0; i < N; i++){
            for (int j = i + 1; j < N; j++){
                if (arr[i] > arr[j]){
                    int tem = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tem;
                }
            }
        }

        for (int val : arr){
            System.out.println(val);
        }
    }

    public static void main(String[] args) throws IOException {

//        Scanner in = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        int N = in.nextInt();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++){
//            arr[i] = in.nextInt();
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 선택정렬
        getSelectionSort(N, arr);

    }

}
