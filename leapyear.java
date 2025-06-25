import java.util.*;
public class leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number%4==0){
            System.out.println("Leap year");

        }
        else
        System.out.println("not an leap year");
    }
}
