//! Implement a simple hashtable using an array where Keys are integer and values 
//! are String. Using modulo operator(%) to determine the index of each key.


class HashTable{
    String[] table;
    int size;
    
    HashTable(){
       size = 10;
       table = new String[size];
    }
    
    int hashFunction(int key){
        return key % size;   
    }
    
    void insert(int key, String value){
       int index = hashFunction(key);
        table[index] = value;
    }
    
    String find(int key){
        int index = hashFunction(key);
        return table[index];
    }
    
    void printTable(){
        for(int i = 0; i < size; i++){
            System.out.println("Index " + i + ": " + table[i]);
        }
    }
    
    public static void main(String[] args){
        HashTable ht = new HashTable();
        ht.insert(10,"apple");
        ht.insert(11,"mango");
        ht.insert(12,"dalia");
        ht.insert(20, "banana");
        ht.printTable();
        System.out.println(ht.find(10));   
    } 
}