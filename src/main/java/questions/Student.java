package questions;

public abstract class Student {
    private int ticks;

    public Student(int ticks) {
        this.ticks = ticks;
    }

    public int getTicks(){
        return ticks;
    }

    public void setTicks(int ticks){
        this.ticks = ticks;
    }

    public abstract boolean pass();
}