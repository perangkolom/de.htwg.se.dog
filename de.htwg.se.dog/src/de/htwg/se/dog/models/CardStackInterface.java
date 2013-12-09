package de.htwg.se.dog.models;

import java.util.Stack;

public interface CardStackInterface<V> {
    /**
     * Returns size of the CardStack
     * 
     * @return StackSize
     */
    int getSize();

    /**
     * Returns the CardStack
     * 
     * @return stack reference
     */
    Stack<V> getStack();

    /**
     * Gets Card from stack between start inc. and range excl. ands removes it
     * from the Stack
     * 
     * @param start
     *            : int startpoint
     * @param range
     *            : int range for random generator
     * @return Card: returns card from stack
     */
    V dealCard(int start, int range);
}