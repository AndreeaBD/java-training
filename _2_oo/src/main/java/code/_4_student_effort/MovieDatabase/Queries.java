package MovieDatabase;

public class Queries {
    MovieDatabase dataBase = new MovieDatabase();

    public void studiosWithMoreThan2Movies() {
        System.out.println("Studios with more than 2 movies: ");
        for (Studio studio : dataBase.studioDatabase) {
            if(studio.getNrFilme() >= 2) {
                System.out.println("  " + studio.getNume());
            }
        }
        System.out.println();
    }

    public void actorCu2OscaruriPlaysIn() {
        System.out.println("Studios in which plays 'Actor cu 2 oscaruri': ");

        for (int i = 0; i < dataBase.studioDatabase.length; i++) {
            Studio studio = dataBase.studioDatabase[i];
            Film[] filme = studio.getFilme();
            for (Film film : filme) {
                if (film.hasActor("actor cu 2 oscaruri")) {
                    System.out.println("  " + studio.getNume());
                }
            }
        }
        System.out.println();
    }

    public void filmsWithOneActorAbove50() {
        System.out.println("Movies in which plays at least one actor with age above 50: ");

        for (Film film : dataBase.filmDatabase) {
            for (Actor actor : film.getActori()) {
                if (actor.getVarsta() >= 50) {
                    System.out.println("  " + film.getNume());
                    break;
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queries queries = new Queries();
        queries.studiosWithMoreThan2Movies();
        queries.actorCu2OscaruriPlaysIn();
        queries.filmsWithOneActorAbove50();
    }
}
