import java.util.ArrayList;

public class HashTable<K,V> {

    private ArrayList<Pair<K,V>> [] table; 

    public HashTable(){
        // Default constructor creates a hashtable with an inital size of 11
        this.table = new ArrayList[11];
        for(int i = 0; i < 11; i++){
            this.table[i] = new ArrayList<Pair<K,V>>();
        }
        return;
    }

    public void put(K key, V value){
        int hashcode = key.hashCode();
        this.table[hashcode % this.table.length].add(new Pair(key, value));
        return;
    }

    public V get(K key){
        int hashcode = key.hashCode();
        Pair<K,V> pair;
        int index = hashcode % this.table.length;
        for(int i = 0; i < this.table[index].size(); i++){
            pair = this.table[index].get(i);
            if(key == pair.getElement0()){
                return pair.getElement1();
            }
        }
        return null;
    }
}