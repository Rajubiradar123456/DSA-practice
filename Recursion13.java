public class Recursion13 {
    public static int friendsparing(int n){
        if(n==1 || n==2){
            return n;
        }
        // single
        int fnm1=friendsparing(n-1);
        // pairing
        int fnm2=friendsparing(n-2);
        int paiways=(n-1)*fnm2;
        // total ways
        int totalways=fnm1+paiways;
        return totalways;

        // or return friendspairing(n-1)+(n-1)*friendspairing(n-2);

    }
    public static void main(String[] args) {
        System.out.println(friendsparing(3));
    }
}
