// import java.util.Scanner;

// public class function2prime {
//     public static boolean isprime(int number){
//          boolean isprime=true;
//         for(int i=2;i<number-1;i++){
//             if(number%i==0){
//                 isprime=false;
//             }
//         }
//         return isprime;
//     }
//     public static void main(String[] args) {
//        System.out.println( isprime(12));
//         }
//     }

    
// or

import java.util.Scanner;

public class function2prime {
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
   
    public static void main(String[] args) {
       System.out.println( isprime(1));
   
        }
    }