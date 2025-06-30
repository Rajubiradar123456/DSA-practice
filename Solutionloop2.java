import java.util.*;
public class Solutionloop2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int evennum=0;
        int oddnum=0;
        while (true) {
            int n=sc.nextInt();  // enter number(enter 0 to stop)
            if(n==0){
                break;
            }
            if(n%2==0){
                evennum+=n;
            }
            else{
                oddnum+=n;
            }
            
        }
        System.out.println("even sum: "+evennum);
        System.out.println("odd sum: "+oddnum);
    }
}
