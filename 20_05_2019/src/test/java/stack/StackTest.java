package stack;

import org.junit.Assert;
import org.junit.Test;

public class StackTest {

    @Test
    public void testAddElementToStack() {
        Stack stack = new Stack(2);
        stack.push(100);
        stack.push(101);
        int actual = stack.pop();
        int expected = 101;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPeek(){
        Stack s = new Stack(2);
        s.push(4);
        s.push(3);
        s.peek();
        int actual = s.peek();
        int expected = 3;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsEmpty(){
        Stack s = new Stack(2);
        Assert.assertTrue(s.isEmpty());
        s.push(5);
    }
}

