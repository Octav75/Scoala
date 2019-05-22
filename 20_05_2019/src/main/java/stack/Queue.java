package stack;

public class Queue {
//    private int firstElem = 0;
//    private int lastElem = 0;
//    private int[] queue;
//
//    public Queue(int capacity){
//        queue = new int[capacity];
//    }
//
//    public String toString(){
//        queue
//    }
//}

    private int[] array;
    private int front;
    private int back;

    public Queue(int maxSize) {
        this.array = new int[maxSize];
        front = back = 0;
    }

    public void enqueue(int elem) {
        if (back < array.length) {
            array[back++] = elem;
        }
    }

    public int dequeue(){
        int value = - 66;
        if ()
    }


    public String toString() { return "Front = " + front + "Back = " + back + }
}