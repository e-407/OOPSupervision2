package questions;

public class NSStudent extends Student {
    public NSStudent(int ticks) {
        super(ticks);
    }

    @Override
    public boolean pass() {
        return getTicks() >= 10;
    }
}