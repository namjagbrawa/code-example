package com.bingo.code.example.iterator;

public class LinkedList<E> implements Collection<E> {
 
    private Node head;
    private Node tail;
    private int size;
     
    public void add(E e){
        Node n = new Node(e, null);
        if(head == null){
            head = n;
            tail = n;
            size++;
        } else {
            tail.setNext(n);
            tail = n;
            size++;
        }
    }
     
    public int size(){
        return size;
    }
 
    @Override
    public Iterator iterator() {
        return new LinkedListIterator();
    }
     
    private class LinkedListIterator implements Iterator {
 
        private Node currentNode = head;
         
        @Override
        public Object next() {
            Object o = currentNode.getData();
            currentNode = currentNode.getNext();
            return o;
        }
 
        @Override
        public boolean hasNext() {
            if(currentNode.getNext() == null){
                return false;
            }
            return true;
        }
         
    }
}