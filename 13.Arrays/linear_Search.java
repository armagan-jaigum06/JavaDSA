public class linear_Search {

    public static int linearSearch(int number[], int key){
        for(int i = 0; i < number.length; i++){
            if(number[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int foodSearch(String menu[], String key){
        for(int i = 0; i < menu.length; i++){
            if(menu[i].equals(key)){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        // int number[] = {3, 6, 9, 2, 10, 8};
        // int key = 10;
        // int index = linearSearch(number, key);
        // if(index == -1){
        //     System.out.println("key is Not Found");
        // } else{
        //     System.out.println("Key is found At the Index of : " + index);
        // }

        String menu[] = {"dosa", "idly", "rice", "biryani"};
        String key = "biryani";
        int index = foodSearch(menu, key);
        if(index == -1){
            System.out.println("Key is not Found");
        } else{
            System.out.println("Food is Available in the key number of : " + index);
        }
    }
}
