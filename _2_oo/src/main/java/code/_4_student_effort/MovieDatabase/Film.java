package MovieDatabase;

import java.util.ArrayList;
import java.util.List;

public class Film {
    private int anAparitie;
    private String nume;
    private Actor[] actori;

    public Film(int anAparitie, String nume, Actor[] actori) {
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = actori;
    }

    public boolean hasActor(String name) {
        for (Actor actor : actori) {
            if (actor.getNume() == name) {
                return true;
            }
        }

        return false;
    }

    public Actor[] getActori() {
        return this.actori;
    }

    public String getNume() {
        return this.nume;
    }
}
