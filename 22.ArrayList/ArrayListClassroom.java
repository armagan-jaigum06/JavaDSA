import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClassroom {

    public static void Swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(2);
        // list.add(5);
        // list.add(9);
        // list.add(3);
        // list.add(6);
        // int idx1 = 1 , idx2 = 3;
        // System.out.println(list);
        // // Swap(list, idx1, idx2);
        // // System.out.println(list);
        // Collections.sort(list);
        // System.out.println(list);
        // // descending order 
        // Collections.sort(list, Collections.reverseOrder());
        // System.out.println(list);

        // Multi array list
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        // ArrayList<Integer> list1 = new ArrayList<>();
        // list1.add(1); list1.add(2);
        // ArrayList<Integer> list2 = new ArrayList<>();
        // mainList.add(list1);
        // // System.out.println(mainList);
        // list2.add(3); list2.add(7);
        // mainList.add(list2);
        // System.out.println(mainList);

        // for(int i=0; i<mainList.size(); i++){
        //     ArrayList<Integer> currList = mainList.get(i);
        //     for(int j=0; j<currList.size(); j++){
        //         System.out.print(currList.get(j) + " ");
        //     }
        //     System.out.println();
        // }
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=1; i<=5; i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        System.out.println(mainList);

        // nested loop for print mainList
        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
    }
}
