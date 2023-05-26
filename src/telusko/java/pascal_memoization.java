package telusko.java;

import java.util.HashMap;
import java.util.Map;



public class pascal_memoization {
    private static Map<String, Integer> cache = new HashMap<>();

    public static void main(String[] args) {
        int n = 5, num = 1;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(pascalTriangle(i,j) + " ");

            }
            System.out.println(" ");
        }
    }
    private static int pascalTriangle(int row,int col){
        if(col==0 || col==row){
            return 1;
        }
        String key = row +"-"+col;
        if(cache.containsKey(key)){
            return cache.get(key);
        }
        else {
            int value = pascalTriangle(row-1,col-1) + pascalTriangle(row-1,col);
            cache.put(key,value);
            return value;
        }
    }
}


