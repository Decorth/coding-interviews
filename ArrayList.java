public class ArrayList<T>{
    
    private T [] arr;
    private int currentSize;
    

    public ArrayList(){
        this.arr = new T [10];
        this.currentSize = 0;
    }

    public void add(T value){
        if(arr.length < currentSize + 1){
            this.increaseListSize();
        }
        this.arr[currentSize+1] = value;
        currentSize++;
    }

    public T get(int index){
        return this.arr[index];
    }

    public void remove(int index){
        this.arr[index] = null;
        for(int i = index+1; i < this.currentSize; i++){
            this.arr[i-1] = this.arr[i];
        }
    }

    public int size(){
        return this.currentSize;
    }

    private void increaseListSize(){
        Object [] newarr = new Object[this.arr.length * 2];
        for(int i = 0; i < this.arr.length; i++){
            newarr[i] = this.arr[i];
        }
        this.arr = newarr;
    }
}
