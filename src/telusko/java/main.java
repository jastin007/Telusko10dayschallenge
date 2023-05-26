package telusko.java;

//Recursion and memoization
//factorial of a number using iteration
public class main {
    public static void main(String[] args) {
        int num = 5;
        int result = fact(num);
        System.out.println(result);
    }
    public static int fact(int num){
       int val = 1;
       for(int i =1;i<=num;i++){
            val = val*i;
       }
       return val;
    }
}
