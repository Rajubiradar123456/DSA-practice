public class Strings {
    public static void main(String[] args) {
        String str="this is raju and his friends";
        CharAt(str);
    }
    public static void CharAt(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    
}
