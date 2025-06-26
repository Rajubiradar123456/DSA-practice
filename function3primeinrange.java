import java.util.Scanner;

public class function3primeinrange {
    public static boolean isprime(int number){
        if(number==2){
            return true;
        }
        for(int i=2;i<number-1;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primeinrange(int number){
        for(int i=2;i<=number;i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
    //    System.out.println( isprime(1));
    primeinrange(20);
        }
    }