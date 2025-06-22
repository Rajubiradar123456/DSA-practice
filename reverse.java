// reverse the given number

// public class reverse {
//     public static void main(String[] args) {
//         int number=143627;
//         int reversed=0;

//         while (number>0) {
//             int r=number%10;
//             reversed=reversed*10+r;
//             number/=10;
//         }
//         System.out.println(reversed);
//     }
    
// }


// print the reverse of a  number
public class reverse {

    public static void main(String[] args) {
        int number=12345;
        while (number>0) {
            int lastdigit=number%10;
            System.out.print(lastdigit);
            number=number/10;            
        }
        System.out.println();
    }
}
