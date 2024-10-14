public class HashTableDoubleHashing {
    int keys[];
    String values[];
    int capacity;
    int size;

    HashTableDoubleHashing(int capacity)
    {
        this.capacity=capacity;
        keys=new int[capacity];
        values=new String[capacity];
        size=0;
        for(int i=0;i<capacity;i++)
        {
            keys[i]=-1;
        }
    }
    int hashFunction1(int key)
    {
        return key%capacity;
    }

    int hashFunction2(int key)
    {
        return 8-(key%8);
    }

    void insert(int key,String value)
    {
        if(size==capacity)
        return;
        int index=hashFunction1(key);
        
        int i=0;
        while(keys[index] != -1 && keys[index] != key){
            i++;
            index=(hashFunction1(key)+(i*hashFunction2(key)))%capacity;
        }
        keys[index]=key;
        values[index]=value;
        size++;
    }

    String find(int key){
        int index = hashFunction1(key);
        int i = 0;
        
        while(keys[index] != -1){
            if(keys[index] == key){
                return values[index];
            }
            i++;
            index=(hashFunction1(key)+(i*hashFunction2(key)))%capacity;  
        }
        return null;
    }

    void delete(int key)
    {
        int index = hashFunction1(key);
        int i = 0;

        while(keys[index] != -1)
        {
            if(keys[index] == key)
            {
                keys[index]=-1;
                values[index]=null;
                size--;
                System.out.println("Key "+key+" deleted");
                return;
            }
            i++;
            index=(hashFunction1(key)+(i*hashFunction2(key)))%capacity;
        }
        System.out.println("Key not found");
    }

    void printTable()
    {
        for(int i=0;i<capacity;i++)
        {
            if(keys[i] != -1)
            {
                System.out.println("Index "+i+": "+keys[i]+"-->"+values[i]);
            }
            else
            {
                System.out.println("Index "+i+": empty");
            }
        }
    }

    public static void main(String[] args) {
        HashTableDoubleHashing ht=new HashTableDoubleHashing(11);
        // ht.printTable();
        ht.insert(20,"20");
        // ht.printTable();
        ht.insert(34, "34");
        ht.insert(45, "45");
        ht.printTable();
        System.out.println(ht.find(20));
        ht.delete(10);
        System.out.println(ht.find(10));
    }
}
