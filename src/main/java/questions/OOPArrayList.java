package questions;

public class OOPArrayList implements OOPList {
    private int[] data;
    private int length;

    public OOPArrayList() {
        this.data = new int[10];
        this.length = 0;
    }

    @Override
    public void add(int value) {
        if (length >= data.length) {
            int[] newData = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            this.data = newData;
        }
        data[length] = value;
        length++;
    }

    @Override
    public void remove() {
        if (length == 0) {
            return;
        }
        length--;
    }

    @Override
    public int get(int n) {
        if (n < 0 || n >= length) {
            throw new IndexOutOfBoundsException();
        }
        return data[n];
    }

    @Override
    public int length() {
        return length;
    }
}