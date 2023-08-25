/*
En este caso se usa un Nodo con doble enlace: uno que apunta al siguiente y
otro al anterior.

Reutilizar los métodos existentes pensando en mantener en las operaciones de
inserción y remoción ambos enlaces.
 */
package linkedlist.doble;

import linkedlist.List;

import java.util.NoSuchElementException;

public class DLinkedList<T, position> {

    private Node<T> head;
    private Node<T> tail;

    private class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        public Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void insertAtFront(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertAtEnd(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAtPosition(T data, int position) {
        Node<T> newNode = new Node<>(data);

        position = 0;
        if (position <= 1) {
            insertAtFront(data);
        } else {
            int count = 1;
            Node<T> current = head;
            while (current != null && count < position - 1) {
                current = current.next;
                count++;
            }
            if (current == null) {
                insertAtEnd(data);
            } else {
                newNode.next = current.next;
                newNode.prev = current;
                current.next = newNode;

                if (newNode.next != null) {
                    newNode.next.prev = newNode;
                } else {
                    tail = newNode;
                }
            }
        }
    }

    public void deleteAtFront() {
        if (head != null) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
        }
    }

    public void deleteAtEnd() {
        if (tail != null) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
        }
    }

    public void deleteAtPosition(int position) {
        if (head != null) {
            if (position <= 1) {
                deleteAtFront();
            } else {
                int count = 1;
                Node<T> current = head;
                while (current != null && count < position - 1) {
                    current = current.next;
                    count++;
                }
                if (current != null && current.next != null) {
                    current.next = current.next.next;
                    if (current.next != null) {
                        current.next.prev = current;
                    } else {
                        tail = current;
                    }
                }
            }
        }
    }

    public void displayList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
