package MovieDatabase;

import java.util.ArrayList;
import java.util.List;

public class Studio {
    private String nume;
    protected Film[] filme;

    public Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = filme;
    }

    public String getNume() {
        return this.nume;
    }

    public int getNrFilme() {
        return this.filme.length;
    }

    public Film[] getFilme() {
        return this.filme;
    }
}
