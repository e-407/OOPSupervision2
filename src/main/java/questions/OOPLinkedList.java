package questions;

import java.util.NoSuchElementException;

public class OOPLinkedList implements OOPList, Cloneable{
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
            if (current == null) throw new NoSuchElementException();
            current = current.getNext();
        }
        if (current == null) throw new NoSuchElementException();
        return current.getValue();
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

    public int getHeadValue() {
        if (head == null) throw new NoSuchElementException();
        return head.getValue();
    }

    @Override
    public OOPLinkedList clone(){
        OOPLinkedList clonedList = new OOPLinkedList();

        if (head != null) {
            clonedList.head = head.clone();
            OOPLinkedListElement current = head.getNext();
            OOPLinkedListElement currentClone = clonedList.head;

            while (current != null) {
                OOPLinkedListElement clonedNode = current.clone();
                currentClone.setNext(clonedNode);
                currentClone = clonedNode;
                current = current.getNext();
            }
        }
        return clonedList;
    }
}