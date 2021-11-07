package MovieDatabase;

import java.util.ArrayList;
import java.util.List;

public class Actor {
    private String nume;
    private int varsta;
    Premiu[] premii;

    public Actor(String nume, int varsta, Premiu[] premii) {
        this.nume = nume;
        this.varsta = varsta;
        this.premii = premii;
    }

    public String getNume() {
        return this.nume;
    }

    public int getVarsta() {
        return this.varsta;
    }
}