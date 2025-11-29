package questions;

public class OOPSortedLinkedList extends OOPLinkedList {

    @Override
    public void add(int value) {
        OOPLinkedListElement newElement = new OOPLinkedListElement(value);
        OOPLinkedListElement head = getHead();

        if (head == null || value < head.getValue()) {
            newElement.setNext(head);
            setHead(newElement);
            return;
        }

        OOPLinkedListElement current = head;
        while (current.getNext() != null && current.getNext().getValue() < value) {
            current = current.getNext();
        }

        newElement.setNext(current.getNext());
        current.setNext(newElement);
    }
}