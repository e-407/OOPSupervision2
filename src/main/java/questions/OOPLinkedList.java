package questions;

import java.util.NoSuchElementException;

public class OOPLinkedList {
    private OOPLinkedListElement head;

    public OOPLinkedList() {
        this.head = null;
    }

    public void add(int value) {
        OOPLinkedListElement newElement = new OOPLinkedListElement(value);
        newElement.setNext(head);
        this.head = newElement;
    }

    public void remove() {
        if (head != null) {
            head = head.getNext();
        }
    }

    public int get(int n) {
        OOPLinkedListElement current = head;
        for (int i = 0; i < n; i++) {
            if (current == null) throw new NoSuchElementException(); // Or throw exception
            current = current.getNext();
        }
        if (current == null) throw new NoSuchElementException();
        return current.getValue();
    }

    public int getHeadValue() {
        if (head == null) throw new NoSuchElementException(); // Or throw exception
        return head.getValue();
    }

    public int length() {
        int count = 0;
        OOPLinkedListElement current = head;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    protected OOPLinkedListElement getHead() {
        return head;
    }

    protected void setHead(OOPLinkedListElement head) {
        this.head = head;
    }
}