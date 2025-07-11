public class arraybinarysearch {
    public static int binarysearch(int number[],int key){
        int start=0,end=number.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(number[mid]==key){
                return mid;
            }
            else if(number[mid]>key){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={2,3,4,5,6,7,8,9};
        int key=2;
        System.out.println("index of number is:" +binarysearch(number, key));
    }
}
