// Check the array is sorted or not
public class Recursion6 {
    public static boolean issorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return issorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,2};
        System.out.println(issorted(arr, 0));
    }
    
}
