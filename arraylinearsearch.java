public class arraylinearsearch {
    public static void main(String[] args) {
        int numbers[]={11,12,13,14,15,16,17,18};
        int key=23;
        int index=linearsearch(numbers, key);
        if(index==-1){
            System.out.println("not found");
        }else{
            System.out.println("key at index:"+index);
        }

    }
    public static int linearsearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        } return -1;
    }
}
