public class HashTableLinearProbing {
    int []keys;
    String[] values;
    int size;
    int capacity;

    HashTableLinearProbing(int capacity)
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
    
    int hashFunction(int key)
    {
        return key%capacity;
    }

    void insert(int key, String value)
    {
        if(size==capacity)
        {
            System.out.println("HashTable is full");
            return;
        }
        int index=hashFunction(key);
        while(keys[index] != -1 && keys[index] != key)
        {
            index=(index+1)%capacity;
        }
        keys[index]=key;
        values[index]=value;
        size++;
    }

    String find(int key)
    {
        int index=hashFunction(key);
        while(keys[index]!=-1)
        {
            if(keys[index]==key)
            {
                return values[index];
            }
            index=(index+1)%capacity;
        }
        return null;
    }

    void delete(int key)
    {
        int index=hashFunction(key);
        while(keys[index]!=-1)
        {
            if(keys[index]== key)
            {
                keys[index]=-1;
                values[index]=null;
                size--;
                System.out.println("Key "+key+" deleted");
            } 
            index=(index+1)%capacity;
        }
        System.out.println("Key Not found");
    }

    void printTable()
    {
        for(int i=0;i<capacity;i++)
        {
            if(keys[i]!=-1)
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
        HashTableLinearProbing ht=new HashTableLinearProbing(10);
        ht.insert(10, "Text1");
        // ht.printTable();
        ht.insert(10, "Text2");
        // ht.printTable(); 
        ht.insert(30, "Text3");
        ht.printTable();
        System.out.println((ht.find(30)));
        System.out.println((ht.find(10)));
    }
}