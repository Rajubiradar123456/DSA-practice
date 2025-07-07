public class array2dpractice2 {
    public static void main(String[] args) {
             int arr[][]={{1,3,4},{4,22,4},{34,6,2}};
             int count=0;
             for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[0].length;j++){
                    if(arr[i][j]==4){
                        count++;
                    }
                }
             }
             System.out.println("The number of 4s are:"+count);
    }
}
