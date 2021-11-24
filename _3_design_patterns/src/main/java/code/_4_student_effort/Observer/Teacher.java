package Observer;

import java.util.ArrayList;

public class Teacher {
    private ArrayList<ObserverStudents> observerStudents = new ArrayList<>();

    void register(Student student) {
        observerStudents.add(student);
    }

    void unregister(Student student) {
        observerStudents.remove(student);
    }

    public void teach (String message) {
        for (ObserverStudents student : observerStudents) {
            student.update(message);
        }
    }
}
