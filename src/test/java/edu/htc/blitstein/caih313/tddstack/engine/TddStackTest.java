package edu.htc.blitstein.caih313.tddstack.engine;

import edu.htc.blitstein.caih313.tddstack.IStackable;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TddStackTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void TddStack(long stackDepth){
        stackDepth = TddStack.DEFAULT_DEPTH;
        assertEquals(100, TddStack.DEFAULT_DEPTH);
    }
    @Test
    public void testIsEmpty(){
        TddStack tddStack = new TddStack();
        assertTrue(tddStack.isEmpty());
    }
    @Test
    public void testIsFull(){
        TddStack tddStack = new TddStack();
        assertFalse(tddStack.isFull());
    }
    @Test
    public void testPop(){
        TddStack tddStack = new TddStack();
        assertNull(tddStack);
    }
    @Test
    public void isEmptyWhenSomethingPushed(){
        TddStack tddStack = new TddStack();
        IStackable istackable = null;
        tddStack.push(istackable);
        assertFalse(tddStack.isEmpty());
    }
    @Test
    public void checkDepthIsThree(){
        TddStack tddStack = new TddStack();
        IStackable istackable1 = null;
        tddStack.push(istackable1);
        IStackable istackable2 = null;
        tddStack.push(istackable2);
        IStackable istackable3 = null;
        tddStack.push(istackable3);
        tddStack.stackDepth = 3;
        assertEquals(true, tddStack.isFull());
    }
}