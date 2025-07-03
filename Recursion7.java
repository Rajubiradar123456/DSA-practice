// public class Recursion7 {
//     public static int firstoccur(int arr[],int key,int i){
//         if(i==arr.length){
//             return -1;
//         }
//         if(arr[i]==key){
//             return i;
//         }
//         return firstoccur(arr, key, i+1);
//     }
//     public static void main(String[] args) {
//         int arr[]={2,3,4,6,4,2,3};
//         System.out.println(firstoccur(arr, 3, 0));
//     }
// }




// all occurance
public class Recursion7 {
    public static void firstoccur(int arr[],int key,int i){
        if(i==arr.length){
            return ;
        }
        if(arr[i]==key){
            System.out.println(i);
        }
     firstoccur(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,6,4,2,3};
        firstoccur(arr, 3, 0);
    }
}
