package stack;

import org.junit.Assert;
import org.junit.Test;

public class QueueTest {

    @Test
    public void testEnqueueDequeue(){
        Queue queue = new Queue(3);
        queue.enqueue(1);
        queue.enqueue(12);
        queue.enqueue(13);
//        Assert.assertEquals(expected 13, queue);
    }

    @Test
    public void testShift(){
        Queue q = new Queue(5);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        System.out.println(q);
        q.dequeue();
        System.out.println(q);

        System.out.println("Vreu sa obtin [4,5,0,0,0]");
    }
}
