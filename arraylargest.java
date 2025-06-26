public class arraylargest {
    public static void main(String[] args) {
        int data[]={12,45,66,88,32,43,26,78,33};
        int index=largest(data);
        System.out.println("the largest :"+index);
    }
    public static int largest(int data[]){
        int large=data[0];
        for(int i=0;i<data.length;i++){
            if(data[i]>large){
                large= data[i];
            }
        }
        return large;
    }
}
