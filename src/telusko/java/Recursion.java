package telusko.java;

//recursion - function calling its function
public class Recursion {
    public static void main(String[] args) {
        int num = 5;
        int result = fact(num);
        System.out.println(result);
    }
    public static int fact(int num){
        if(num==0)
            return 1;
        return num*fact(num-1);
    }
}
