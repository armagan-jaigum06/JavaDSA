public class Arrays {

    public static void update(int marks[]){
        for(int i = 0; i<marks.length; i++){
        marks[i] += 1;
        }
    }
    public static void main(myString[] args) {
        int marks[] = {99, 59, 89};
        update(marks);
        for(int i = 0; i< marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        
    }
    
}
