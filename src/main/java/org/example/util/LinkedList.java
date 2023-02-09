package org.example.util;

public class LinkedList<E> {

    private Node<E> first;
    private Node<E> last;

    public LinkedList() {
        this.first = null;
        this.last = null;
    }

    /**
     *
     * @param e
     */
    public void add(E e) {
        Node<E> node = new Node<E>(e);
        if (this.first == null) {
            this.first = node;
            return;
        }
        Node<E> current = this.first;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
        this.last = current.next;
    }


    public void removeFirst() {
        if (this.first == null) {
            return;
        }
        this.first = this.first.next;
    }

    public void removeLast() {
        if (this.first == null) {
            return;
        }
        Node<E> current = this.first;
        while (current.next != null) {
            current = current.next;
        }
        this.last = current.prev;
        this.last.next = null;
    }


    public void addFirst(E element) {

    }

    public E getFirst() {
        return this.first.element;
    }


    public E getLast() {
        return this.last.element;
    }

    /**
     *
     */
    public void foreach() {
//        StringBuilder sb = new StringBuilder("[");
//        Node<E> current = this.first;
//        if (current == null) {
//            System.out.println("Empty");
//            return ;
//        }
//        while (true) {
//            if (current.next == null) {
//                sb.append(current.element);
//                break;
//            } else {
//                sb.append(current.element).append(", ");
//                current = current.next;
//            }
//        }
//        sb.append("]");
//        System.out.println(sb.toString());
    }

    public void addLast(E element) {

    }
    static class Node<E> {
        Node<E> prev;
        Node<E> next;
        E element;

        public Node(E element) {
            this.prev = null;
            this.next = null;
            this.element = element;
        }
    }
}
