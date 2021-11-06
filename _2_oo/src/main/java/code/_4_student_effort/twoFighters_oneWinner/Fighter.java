package twoFighters_oneWinner;

public class Fighter {
    private String name;
    private int health;
    private int damagePerAttack;

    public Fighter(String name, int damagePerAttack) {
        this.name = name;
        this.health = 100;
        this.damagePerAttack = damagePerAttack;
    }

    public int getHealth() {
        return this.health;
    }

    public String getName() {
        return this.name;
    }

    public void attack(Fighter opponent) {
        opponent.health = opponent.health - this.damagePerAttack;
    }
}
