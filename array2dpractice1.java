public class array2dpractice1 {
    public static void main(String[] args) {
        int arr[][]={{1,3,4},{4,22,4},{34,6,2}};
        int sum=0;
        for(int i=0;i<arr[0].length;i++){
            sum+=arr[2][i];

        }
        System.out.print("the sum is:"+sum);
    }
}
