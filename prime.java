// import java.util.*;;
// public class prime {
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int number=sc.nextInt();
//         int count=0;
//         for(int i=1;i<=number;i++){
//             if(number%i==0){
//                 count++;
//             }
//         }
//         if(count==2){
//             System.out.println("it is aprime");
//         }
//         else
//         System.out.println("Not a prime");
//     }
// }



// or

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        
        if(number==2){
            System.out.println("is prime");
        }else{
            boolean isprime=true;
        for(int i=2;i<number-1;i++){
            if(number%i==0){
                isprime=false;
            }
        }
            if(isprime==true){
                System.out.println("is prime");
            }else{
                System.out.println("not a prime");
            }
        }
    }

    
}
