import java.util.Scanner;

public class practicefunction3 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(palindrome(n));
       
        
    }

    public static int palindrome(int n){
        int mynumber=n;
        int reverse=0;
        while(n>0){
               int last=n%10;
               reverse=reverse*10+last;
               n=n/10;
        }

        if(mynumber==reverse){
            System.out.println("it is palindrome");
        }
        else{
            System.out.println("it is not a palindrome");
        }
        return reverse;

     

    }
}
