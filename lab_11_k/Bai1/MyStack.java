package lab_11_k.Bai1;

import java.util.ArrayList;

public class MyStack {
    private int limit;
    private ArrayList<Object> data=new ArrayList<>();
    public MyStack(int size){
        this.limit=size;
    }
    public boolean empty(){
        return data.isEmpty();
    }
    public boolean full(){
        return (data.size()==limit);
    }
    public void put(Object data){
        this.data.add(data);
    }
    public Object get( int index){
        return this.data.get(index-1);
    }
}
