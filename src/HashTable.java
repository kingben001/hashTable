import org.w3c.dom.Node;

import java.util.ArrayList;

public class HashTable {
    private int size = 7;
    private Node[] datamap;
    class Node{
        private String key;
        private int value;
        private Node next;

        Node(String key, int value){
            this.key = key;
            this.value = value;
        }
    }
    public HashTable(){
     datamap = new Node[size];
    }

    public void printTable(){
        for (int i = 0; i < datamap.length; i++){
            System.out.println(i + ":");
            Node temp = datamap[i];
            while (temp != null){
                System.out.println("   {" + temp.key + "= " + temp.value + "}");
                temp = temp.next;
            }
        }
    }
    private int hash(String key){
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for (int i = 0; i < keyChars.length; i++){
            int asciiValue = keyChars[i];
            hash = (hash + asciiValue * 23) % datamap.length;
        }
        return hash;
    }

    public void set(String key, int value){
      int index = hash(key);
      Node newNode = new Node(key,value);
      if (datamap[index] == null){
          datamap[index] = newNode;
      } else{
          Node temp = datamap[index];
          while (temp.next != null){
              temp = temp.next;
          }
          temp.next = newNode;
      }
    }

    public int get(String key){
        int index = hash(key);
        Node temp = datamap[index];
        while (temp != null){
            if (temp.key == key) return temp.value;
            temp = temp.next;
        }
        return 0;
    }
    public ArrayList keys(){
        ArrayList<String> allkeys = new ArrayList<>();
        for (int i = 0; i < datamap.length; i++){
            Node temp = datamap[i];
            while (temp != null){
                allkeys.add(temp.key);
                temp = temp.next;
            }
        }
        return allkeys;
    }



}
