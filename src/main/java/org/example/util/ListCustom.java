package org.example.util;

public interface ListCustom<E> {
    void add(E e);
    int size();
    E get(int i);
    E remove(int i);
}
