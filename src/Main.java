import java.util.HashMap;

public class Main {
    public static boolean itemInCommon(int[] array1, int[] array2){
        HashMap<Integer, Boolean> myHashMap = new HashMap<>();

        for (int i : array1){
            myHashMap.put(i,true);
        }
        for (int j : array2){
          if  (myHashMap.get(j) != null) return true;
        }
        return false;
    }
    public static void main(String[] args) {

//        HashTable myHashTable  = new HashTable();
//
//        myHashTable.set("paint", 20);
//        myHashTable.set("nails", 40);
//        myHashTable.set("nails", 100);
//        myHashTable.set("tile", 50);
//        myHashTable.set("lumber", 80);
//
//        System.out.println(myHashTable.keys());

        int [] array1 = {1,3,5};
        int [] array2 = {2,4,6};

        System.out.println(itemInCommon(array1,array2));

    }
}
