package questions;

public class NinjaEmployee extends Employee implements Ninja{
    private int battlesFought;

    public NinjaEmployee(String name, int salary, int battlesFought) {
        super(name, salary);
        this.battlesFought = battlesFought;
    }

    @Override
    public int getBattlesFought() {
        return battlesFought;
    }

    @Override
    public void setBattlesFought(int battlesFought) {
        this.battlesFought = battlesFought;
    }
}
