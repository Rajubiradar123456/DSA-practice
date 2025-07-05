public class arraypracticep1 {
    public static void main(String[] args) {
        int num[]={1,2,3,4};
       System.out.println( repeat(num));
    }
    public static boolean repeat(int num[]) {
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    return true;
            }
        }
        
    }
    return false;
    
    }
}
