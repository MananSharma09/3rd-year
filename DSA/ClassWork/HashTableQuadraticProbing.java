public class HashTableQuadraticProbing {
    int keys[];
    String values[];
    int size;
    int capacity;

    HashTableQuadraticProbing(int capacity)
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

    void insert(int key,String value)
    {
        if(size==capacity){
            System.out.println("Hash table is full");
            return;
        }
        int index=hashFunction(key);
        int i=0;

        while(keys[index] != -1 && keys[index] != key)
        {
            i++;
            index=((hashFunction(key))+i*i)%capacity;
        }
        keys[index]=key;
        values[index]=value;
        size++;
    }

    String find(int key){
        int index = hashFunction(key);
        int i = 0;
        
        while(keys[index] != -1){
            if(keys[index] == key){
                return values[index];
            }
            i++;
            index = (hashFunction(key) + i * i) % capacity;
        }
        return null;
    }


    void delete(int key)
    {
        int index=hashFunction(key);
        
        int i=0;
        while(keys[index] != -1){
            if(keys[index]==key)
            {
                keys[index]=-1;
                values[index]=null;
                size--;
                System.out.println("Key "+key+" deleted");
                return;
            }
            i++;
            index=(hashFunction(key)+i*i)%capacity;
        }
        System.out.println("Key not found");
    }

    void printTable(){
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
        HashTableQuadraticProbing ht = new HashTableQuadraticProbing(10);
        System.out.println("Initial table");
        ht.printTable();
        System.out.println("----------------");
        ht.insert(10,"Text1");
        ht.printTable();
        System.out.println("----------------");
        ht.insert(20, "Text2");
        ht.printTable();
        System.out.println("----------------");
        ht.insert(30, "Text3");
        ht.printTable();
        System.out.println("----------------");
        System.out.println(ht.find(30));
        ht.delete(30);
        ht.printTable();
    }
}

