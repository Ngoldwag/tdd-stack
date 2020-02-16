package edu.htc.blitstein.caih313.tddstack.engine;

import edu.htc.blitstein.caih313.tddstack.IStackable;

public class TddStack {
    public static long DEFAULT_DEPTH = 100;
    public long stackDepth;
    IStackable stackable;

    public TddStack(long stackDepth) {

    }

    public TddStack() {

    }

    public boolean isEmpty() { return false; }

    public boolean isFull() { return false; }

    public void push(IStackable stackable) {
    }

    public IStackable pop() { return null;}
}
