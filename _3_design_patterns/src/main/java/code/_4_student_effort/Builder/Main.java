package Builder;

public class Main {
    public static void main(String... args) {
        Person person = new Person.PersonBuilder("Andreea")
                .setDrivingLicense("Categoria B")
                .setMarried(false)
                .setUniversity("Politehnica")
                .build();
        System.out.println("Persoana " + person.getName() + " studiaza la " + person.getUniversity() + " si are permis " +
                person.getDrivingLicense());
    }

}
