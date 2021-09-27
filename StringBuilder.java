import java.util.ArrayList;

public class StringBuilder {
    
    private ArrayList<String> arr;
    
    public StringBuilder(){
        // StringBuilder's starts by creating an empty arraylist with 16 slots
        this.arr = new ArrayList<>(16);
        return;
    }

    public StringBuilder(int capacity){
        // StringBuilder can make a customised size of arraylist
        this.arr = new ArrayList<>(capacity);
        return;
    }

    public void append(String s){
        arr.add(s);
    }

    public String toString(){
        String out = "";
        for(int i=0; i < arr.size(); i++){
            out += arr.get(i);
        }
        return out;
    }
}
