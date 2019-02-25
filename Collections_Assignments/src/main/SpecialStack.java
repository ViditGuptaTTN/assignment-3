package main;

import java.util.Collections;
import java.util.Stack;

public class SpecialStack {
    Stack<Integer> s = new Stack();
    final int sizeStack = 5;

    public void pushStack(Stack st, int element) {
        st.push(element);
    }

    public void popStack(Stack st) {
        st.pop();
    }

    public boolean isEmptyStack(Stack st) {
        return st.empty();

    }

    public boolean isFull(Stack st) {
        if (st.size() == sizeStack)
            return true;
        else
            return false;
    }
    public int minStack(Stack st) {
        return (int) Collections.min(st);
    }
}

