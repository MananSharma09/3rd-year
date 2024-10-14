import java.util.*;
public class HashTableOpenHashing {
    int size;
    LinkedList<Entry>[]table;

    HashTableOpenHashing(){
        size=10;
        table=new LinkedList[size];
        for(int i=0;i<size;i++)
        {
            table[i]=new LinkedList<>();
        }
    }

    int hashFunction(int key){
        return key%size;
    }

    void insert(int key, String value){
        int index =  hashFunction(key);
         LinkedList<Entry> bucket = table[index];
         
         for(Entry entry : bucket){ //value update
             if(entry.key == key){
                 entry.value = value;
                 return;
             }
         }
         
        bucket.addFirst(new Entry(key,value));
     }
 

    String find(int key){
        int index=hashFunction(key);
        LinkedList<Entry> bucket=table[index];
        for(Entry entry: bucket){
            if(entry.key == key)
            {
                return entry.value;
            }
        }
        return null;
    }

    void delete(int key)
    {
        int index = hashFunction(key);
        LinkedList<Entry> bucket= table[index];
        for(Entry entry : bucket)
        {
            if(entry.key == key)
            {
                bucket.remove(entry);
                return;
            }
        }
        System.out.println("Key not found");
    }

    void printTable(){
        for(int i = 0; i < size; i++){
            System.out.print("Index " + i + ": ");
            for(Entry entry : table[i]){
                System.out.println("(" + entry.key + "," + entry.value + ") ->");
            }
            
            System.out.println("null");
        }
    }


    static class Entry{
        int key;
        String value;

        Entry(int key, String value)
        {
            this.key=key;
            this.value=value;
        }
    }

    public static void main(String[] args) {
        HashTableOpenHashing ht=new HashTableOpenHashing();
        ht.insert(10, "10");
        ht.printTable();
        ht.insert(20, "20");
        // ht.printTable();
        ht.insert(30, "20");
        // ht.printTable();
        
        ht.insert(31, "31");
        ht.printTable();
        
        System.out.println(ht.find(31));
        ht.delete(31);
        ht.printTable();

    }
}
