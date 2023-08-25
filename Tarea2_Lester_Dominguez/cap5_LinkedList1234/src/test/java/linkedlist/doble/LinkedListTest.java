package linkedlist.doble;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DLinkedListTest {

    @Test
    public void testDLinkedList() {
        DLinkedList<Integer> list = new DLinkedList<>();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtFront(5);
        list.insertAtPosition(15, 2);

        list.displayList(); // Resultado esperado: 5 10 15 20

        list.deleteAtEnd();
        list.deleteAtPosition(2);

        list.displayList();
    }
}