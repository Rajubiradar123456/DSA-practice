import java.util.Scanner;

public class Breakst {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    while (true) {
            int number=sc.nextInt();
        if(number % 10 == 0){
            break;
        }
             System.out.println(number);
       
    }

    } 
}
