package org.example.util;

import java.util.Arrays;

public class ArrayListCustom<E> implements ListCustom<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public ArrayListCustom() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(E e) {
        if (this.size == this.elements.length) {
            ensureCapacity();
        }
        this.elements[size++] = e;
    }

    @SuppressWarnings("unchecked")
    public E get(int i) {
        if (i < 0 || i > this.size - 1) {
            throw new IndexOutOfBoundsException("Index " + i + " out of bounds");
        }
        return (E) this.elements[i];
    }

    public E remove(int i) {
        int numElts = this.elements.length - ( i + 1 ) ;
        System.arraycopy(this.elements, i + 1, this.elements, i, numElts ) ;
        size--;
        return (E) this.elements[i];
    }

    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
//        [1, 2, 3]
        for (int i = 0; i < this.size; i++) {
            sb.append(this.elements[i].toString());
            if (i < this.size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private void ensureCapacity() {
        int newSize = this.elements.length * 2;
        this.elements = Arrays.copyOf(this.elements, newSize);
    }
}
