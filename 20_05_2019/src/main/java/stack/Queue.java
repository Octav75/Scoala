package stack;

import java.util.Arrays;

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

    private int[] queue;
    private int front;
    private int back;

    public Queue(int maxSize) {
        this.queue = new int[maxSize];
        front = back = 0;
    }



    public void enqueue(int elem) {
        if (back < queue.length) {
            queue[back++] = elem;
        }
    }

    public int dequeue(){
        int value = - 66;
        if (front<back){
            value=queue[front];
            queue[front] = 0;
            shift();
            front++;
        }
        return value;
    }

    public void shift(){
        for (int i = front; i < back; i++){
            queue[i] = queue[i+1];
            queue[i+1] = 0;
            }
        }


    public String toString() {
        return "Front = " + front + "Back = " + back + "\n Queue = " + Arrays.toString(queue);

    }
}
