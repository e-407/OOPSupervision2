package questions;

public class OOPLinkedListElement implements Cloneable{
    private int value;
    private OOPLinkedListElement next;

    public OOPLinkedListElement(int value) {
        this.value = value;
        this.next = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public OOPLinkedListElement getNext() {
        return next;
    }

    public void setNext(OOPLinkedListElement next) {
        this.next = next;
    }

    @Override
    public OOPLinkedListElement clone(){
        try {
            return (OOPLinkedListElement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}