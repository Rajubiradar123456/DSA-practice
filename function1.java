public class function1 {
    public static int multiply(int a,int b){
        int mul=a*b;
        return mul;
    }
    public static void main(String[] args) {
        int a=2;
        int b=3;
        int res2=multiply(a, b);
        System.out.println(res2);


        System.out.println(multiply(5, 8));
        // call by value
        // System.out.println(res);
    }
}
