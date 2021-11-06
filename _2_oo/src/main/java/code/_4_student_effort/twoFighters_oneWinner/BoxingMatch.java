package twoFighters_oneWinner;

public class BoxingMatch {
    private Fighter fighter1;
    private Fighter fighter2;
    private static int turn;

    public BoxingMatch(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        turn = 0;
    }

    public String fight() {
        while (fighter1.getHealth() >= 0 && fighter2.getHealth() >= 0) {
            if (turn % 3 == 0) {
                fighter1.attack(fighter2);
            } else {
                fighter2.attack(fighter1);
            }
            turn++;
        }

        if(fighter1.getHealth() <= 0) {
            return "Fighter " + fighter2.getName() + " won!";
        }

        return "Fighter " + fighter1.getName() + " won!";
    }

    public static void main(String... args) {
        BoxingMatch match = new BoxingMatch(new Fighter("Andrei", 20), new Fighter("Dan", 30));
        System.out.println(match.fight());
    }
}
