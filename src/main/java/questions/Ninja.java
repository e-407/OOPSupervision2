package questions;

public interface Ninja {

    default void fight() {
        System.out.println("Fighting");
    }

    default void hide() {
        System.out.println("Hiding");
    }

    int getBattlesFought();

    void setBattlesFought(int battlesFought);
}