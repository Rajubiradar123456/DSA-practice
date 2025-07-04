public class arraymaxsubarray {
    public static void subarray(int number[]){
        int currentsum=0;
        int maxval=number[0];
        for(int i=0;i<number.length;i++){
            for(int j=i;j<number.length;j++){
                currentsum=0;
                for(int k=i;k<=j;k++){
                    currentsum+=number[k];
                }
                System.out.println(currentsum);
                if(maxval<currentsum){
                    maxval=currentsum;
                }
            }
            
        }
        System.out.println("the maximum sum is:"+maxval);
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        subarray(number);
    }
}
