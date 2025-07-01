// find the fibonacci  number
public class Recursive5 {
    public static int fibbon(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1=fibbon(n-1);
        int fnm2=fibbon(n-2);
        int fn=fnm1+fnm2;
        return fn;
    }
 public static void main(String[] args) {
    int n=10;
    System.out.println(fibbon(n));
 }   
}
