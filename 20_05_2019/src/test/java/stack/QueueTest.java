package stack;

import org.junit.Test;

public class QueueTest {

    @Test
    public void testEnqueueDequeue(){
        Queue queue = new Queue(3);
        queue.enqueue(1);
        queue.enqueue(12);
    }

}
