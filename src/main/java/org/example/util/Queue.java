package org.example.util;

import java.util.Collection;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public interface Queue<E> {
    /**
     * Adds element e to the queue at the end (tail) of the queue without violating the restrictions on the capacity.
     * Returns true if success or IllegalStateException if the capacity is exhausted.
     * @param e
     * @return
     */
    boolean add(E e);


    /**
     * Insert the new element e into the queue without violating capacity restrictions.
     * @param e E
     * @return
     */
    boolean offer(E e);
    E remove();

    /**
     * Removes the head of the queue and returns it. If the queue is empty, it returns null.
     * @return E
     */
    E poll();
    
    E element();
    /**
     * Returns the head (front) of the queue without removing it.
     * @return E
     */
    E peek();
}
