import java.util.*;

public class practicefunction1 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(iseven(n));
    }

public static boolean iseven(int n){
    if(n%2==0){
        return true;
    }
    else{
        return false;
    }
}
}