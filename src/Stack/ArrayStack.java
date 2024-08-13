package Stack;

import javax.management.ObjectName;

class ArrayStack implements Stack{

    Object[]a;
    int size;
    ArrayStack(int capacity){
        a=new Object[capacity];
    }
    @Override
    public Object peek() {
        if(size==0)throw new IllegalStateException("Stack is empty");
        return a[size-1];
    }
    @Override
    public Object pop() {
        if(size==0)throw new IllegalStateException("Stack is empty");
     
        Object temp=a[--size];
        a[size]=null;
        return temp;
    }
    @Override
    public void push(String x) {
       if(size==a.length)
        resize();
        a[size++]=x;     
    }
    @Override
    public int size() {
        
        return size;
    }
    private void resize(){
        Object[] temp=a;
        a=new Object[2*temp.length];
        System.arraycopy(temp, 0, a, 0, size);
    }
}
