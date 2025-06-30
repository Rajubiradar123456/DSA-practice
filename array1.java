public class array1 {
    public static void main(String[] args) {
        int marks[]={20,21,22};
        update(marks);

        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        
    }
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    
}
