package BOJ.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1157_Bronze1 {
    public static void main(String[] args) throws IOException {

        String str = "";
        String[] strArray;
        HashMap<String, Integer> hashMap = new HashMap<>();

        int max = 0;
        boolean isCheck = false;
        String strOne = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        str = br.readLine().trim().toUpperCase();
        br.close();

        strArray = str.split("");

        for(int i = 0; i < strArray.length ; i++){

            if (hashMap.containsKey(strArray[i])){
                hashMap.put(strArray[i], hashMap.get(strArray[i])+1);
            }else {
                hashMap.put(strArray[i], 1);
            }
        }

        for (String key : hashMap.keySet()){

            int val = hashMap.get(key);

            if (max == val){
                isCheck = true;
            } else if (max < val){
                max = val;
                strOne = key;
                isCheck = false;
            }
        }

        if (isCheck){
            System.out.println("?");
        }else {
            System.out.println(strOne);
        }
    }
}
