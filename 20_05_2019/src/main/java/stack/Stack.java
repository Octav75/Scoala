package stack;

//public class Stack {
//    private int [] stack;
//    private int index = 0;
//    int x = 5;
//
//    public Stack(int x) {
//        this.stack = new int[x];
//
//        for (x = 0; x <= 5; x ++){
//
//        }
//
//        if (index == x){
//            return new Stack(x);
//        }
//        System.out.println(index);
//    }
//}

public class Stack {
    private int top;
    private int[] stackData;
    private int capacity;
    public Stack(int capacity){
        top = 0;
        stackData = new int[capacity];
    }

    public void push (int element){
        if (top < capacity){
            stackData[top] = element;
            top++;
        }
        else System.out.println("Stack is full");
    }

    public int pop(){
        int value = -1;
        if(top > 0){
            value = stackData[--top];
            stackData[top] = 0;
        }
        return value;
    }

    public int peek(){
//        int value = -1;
//        if(top>0){
//            value = stackData[--top];
//            stackData[top] = 0;
//        }
//        return value;
        return top > 0 ? stackData[--top] : -1;
    }

    public boolean isEmpty(){
        if (stackData[0] == 0);
        {
            return true;
        }
    }

}