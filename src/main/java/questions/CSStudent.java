package questions;

public class CSStudent extends Student {
    public CSStudent(int ticks) {
        super(ticks);
    }

    @Override
    public boolean pass() {
        return getTicks() >= 20;
    }
}