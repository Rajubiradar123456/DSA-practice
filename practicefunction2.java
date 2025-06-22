import java.util.Scanner;

public class practicefunction2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sums(n));
    }
    public static int sums(int n){
        int sum=0;
        while (n>0) {
            int q=n%10;
             sum=sum+q;
             n=n/10;
            }
            return sum;
    }

    
}
