package org.example.util;


import com.sun.xml.internal.bind.v2.TODO;

import java.util.Objects;

public class DoublyLinkedList<E> {
    private  Node<E> first;
    private  Node<E> last;
    private  int size;
    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    /**
     *
     * @param data
     */
    public void add(E data) {
        Node<E> node = new Node<>(data);
        if (this.last == null) {
            this.first = node;
            this.last = node;
            this.size++;
        } else {
            this.last.next = node;
            node.prev = this.last;
            this.last = node;
            this.size++;
        }
    }

    /**
     *
     * @param e
     */
    public void addFirst(E e) {
        Node<E> node = new Node<>(e);
        if (this.first == null) {
            this.first = node;
            this.size++;
        } else {
            node.next = this.first;
            this.first = node;
            this.size++;
        }
    }

    /**
     *
     * @param e
     */
    public void addLast(E e) {
        Node<E> node = new Node<>(e);
        if (this.last == null) {
            this.last = node;
            this.size++;
        } else {
            this.last.next = node;
            this.last = node;
            this.size++;
        }
    }


    /**
     *
     * @return
     */
    public E getFirst() {
        return this.first.data;
    }

    /**
     *
     * @return
     */
    public E getLast() {
        return this.last.data;
    }

    /**
     *
     */
    public void removeFirst() {
        if (this.first == null) {
            return;
        }
        this.first = this.first.next;
        this.first.prev = null;
        this.size--;
    }


    /**
     *
     */
    public void removeLast() {
        if (this.last == null) {
            return;
        }
        this.last = this.last.prev;
        this.last.next = null;
        this.size--;
    }



    public void foreach() {
        StringBuilder sb = new StringBuilder("[");
       Node<E> current = this.first;
        if (current == null) {
            System.out.println("Empty");
            return ;
        }
        while (true) {
            if (current.next == null) {
                sb.append(current.data);
                break;
            } else {
                sb.append(current.data).append(", ");
                current = current.next;
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    /**
     * Return true if this list contains the specified element
     * @param e
     * @return
     */
    public boolean contains(E e) {
        return this.indexOf(e) == -1;
    }

    /**
     * return the index of the first occurrence of the specified element in this list
     * or -1 if this list does not contain the element.
     * @param e
     * @return
     */
    public int indexOf(E e) {
        int index = 0;
        if (e == null) {
            for (Node<E> x = this.first; x !=null; x = x.next) {
                if (Objects.equals(x.data, null)) {
                    return index;
                }
                index++;
            }
        } else {
            for (Node<E> x = this.first; x!= null; x = x.next) {
                if (Objects.equals(x.data, e)) {
                    return index;
                }
                index++;
            }
        }
        return -1;
    }


    //TODO
    /**
     *
     * @param o
     * @return
     */
    public boolean remove(Object o) {
        return false;
    }

    /**
     * Returns the number of element in this list
     * @return: the number of elements in this list
     */
    public int size() {
        return this.size;
    }
    static class Node<E> {
        E data;
        Node<E> prev;
        Node<E> next;

        public Node(E data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
}
