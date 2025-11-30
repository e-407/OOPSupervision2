package questions;

public class MyClass implements Cloneable{
    private String mName;
    private int[] mData;

    public MyClass(String mName, int[] mData) {
        this.mName = mName;
        this.mData = mData;
    }

    public MyClass (MyClass toCopy) {
        this.mName = toCopy.mName;
        this.mData = new int[toCopy.mData.length];
        for (int i=0; i<toCopy.mData.length; i++){
            this.mData[i] = toCopy.mData[i];
        }
    }

    public int[] getMData() {
        return mData;
    }

    public String getMName() {
        return mName;
    }

    @Override
    public MyClass clone() {
        try {
            MyClass copy = (MyClass) super.clone();
            copy.mData = new int[mData.length];
            for (int i=0; i<mData.length; i++){
                copy.mData[i] = mData[i];
            }
            return copy;

        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
